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
 * @created 2019-03-28 09:24
 * @changeRecord
 */
public class MyXid implements Xid {
    public int formatId;
    public byte gtrid[];
    public byte bqual[];

    public MyXid() {
    }

    public MyXid(int formatId, byte gtrid[], byte bqual[]) {
        this.formatId = formatId;
        this.gtrid = gtrid;
        this.bqual = bqual;
    }

    @Override
    public int getFormatId() {
        return formatId;
    }

    @Override
    public byte[] getBranchQualifier() {
        return bqual;
    }

    @Override
    public byte[] getGlobalTransactionId() {
        return gtrid;
    }
}