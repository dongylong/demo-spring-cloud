package com.cloud.order.bean.enumerate;

import com.framework.utils.json.JsonUtil;
import com.framework.validate.error.ErrorCode;

import java.util.Map;
import java.util.TreeMap;

/**
 * @author dongyl
 * @date 21:45 8/15/18
 * @project order-svr
 */
public enum OrderErrorCode implements ErrorCode {
    PARAM_EMPTY(10000,"参数为空"),
    DB_DATA_EMPTY(10001,"数据库数据为空"),
    DB_UPDATE_FAILURE(10002,"更新数据库失败")
    ;

    private final int code;
    private final String message;

    OrderErrorCode(int code, String message) {
        this.code = code;
        this.message = message;
    }

    @Override
    public int getCode() {
        return 0;
    }

    @Override
    public String getMessage() {
        return null;
    }


    private static Map<Integer, OrderErrorCode> map =
            new TreeMap<>();

    static {
        for (OrderErrorCode orderErrorCode : values()) {
            map.put(orderErrorCode.getCode(), orderErrorCode);
        }
    }

    public static OrderErrorCode errorCodeFor(int value) {
        return map.get(value);
    }

    public static void addNewErrorCodes(OrderErrorCode[] codes) {
        for (OrderErrorCode orderErrorCode : codes) {
            if (!map.containsKey(orderErrorCode.getCode())) {
                map.put(orderErrorCode.getCode(), orderErrorCode);
            }
        }
    }

    @Override
    public String toString() {
        return JsonUtil.objToJson(this);
    }


}
