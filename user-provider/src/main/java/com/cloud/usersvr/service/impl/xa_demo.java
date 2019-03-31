package com.cloud.usersvr.service.impl;

import com.mysql.jdbc.jdbc2.optional.MysqlXADataSource;

import javax.sql.XAConnection;
import javax.transaction.xa.XAResource;
import javax.transaction.xa.Xid;
import java.sql.Connection;
import java.sql.Statement;

/**
 * @author dongyl
 * @version 1.0
 * @title
 * @description
 * @company 好未来-爱智康
 * @created 2019-03-28 09:29
 * @changeRecord
 */

public class xa_demo {
    public static MysqlXADataSource GetDataSource(
            String connString,
            String user,
            String passwd) {
        try {
            MysqlXADataSource ds = new MysqlXADataSource();
            ds.setUrl(connString);
            ds.setUser(user);
            ds.setPassword(passwd);
            return ds;
        } catch (Exception e) {
            System.out.println(e.toString());
            return null;
        }
    }

    public static void main(String[] args) {
        String connString1 = "jdbc:mysql://192.168.24.43:3306/bank_shanghai";
        String connString2 = "jdbc:mysql://192.168.24.166:3306/bank_beijing";
        try {
            MysqlXADataSource ds1 =
                    GetDataSource(connString1, "peter", "12345");
            MysqlXADataSource ds2 =
                    GetDataSource(connString2, "david", "12345");
            XAConnection xaConn1 = ds1.getXAConnection();
            XAResource xaRes1 = xaConn1.getXAResource();
            Connection conn1 = xaConn1.getConnection();
            Statement stmt1 = conn1.createStatement();
            XAConnection xaConn2 = ds2.getXAConnection();
            XAResource xaRes2 = xaConn2.getXAResource();
            Connection conn2 = xaConn2.getConnection();
            Statement stmt2 = conn2.createStatement();
            Xid xid1 = new MyXid(
                    100,
                    new byte[]{0x01},
                    new byte[]{0x02});
            Xid xid2 = new MyXid(
                    100,
                    new byte[]{0x11},
                    new byte[]{0x12});
            try {
                xaRes1.start(xid1, XAResource.TMNOFLAGS);
                stmt1.execute("UPDATE account SET money = money - 10000 WHERE user = 'david'");
                xaRes1.end(xid1, XAResource.TMSUCCESS);
                xaRes2.start(xid2, XAResource.TMNOFLAGS);
                stmt2.execute("UPDATE account SET money = money + 10000 WHERE user = 'mariah'"
                );
                xaRes2.end(xid2, XAResource.TMSUCCESS);
                int ret2 = xaRes2.prepare(xid2);
                int ret1 = xaRes1.prepare(xid1);
                if (ret1 == XAResource.XA_OK && ret2 == XAResource.XA_OK) {
                    xaRes1.commit(xid1, false);
                    xaRes2.commit(xid2, false);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }
}
