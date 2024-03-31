package com.xuecheng.exception;

/**
 * @author zengweichuan
 * @description 通用错误信息枚举类
 * @date 2024/3/31
 */
//region Description
public enum CommonError {
    //endregion

    UNKOWN_ERROR("执行过程异常,请重试"),
    PARAMS_ERROR("非法参数"),
    OBJECT_NULL("对象为空"),
    QUERY_NULL("查询结果为空"),
    REQUEST_NULL("请求参数为空");

    private String errMessage;

    public String getErrMessage() {
        return errMessage;
    }

    private CommonError(String errMessage) {
        this.errMessage = errMessage;
    }

}
//</editor-fold>
