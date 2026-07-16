package com.shancj.cloudpicturebackend.common;

import com.shancj.cloudpicturebackend.exception.ErrorCode;

public class ResultUtils {

    /**
     * 成功
     *
     * @param <T>  响应数据类型
     * @param data 响应数据
     * @return 响应体
     */
    public static <T> BaseResponse<T> success(T data) {
        return new BaseResponse<>(0, data, "ok");
    }

    /**
     * 失败
     *
     * @param errorCode 错误码
     * @return 响应体
     */
    public static BaseResponse<?> error(ErrorCode errorCode) {
        return new BaseResponse<>(errorCode);
    }

    /**
     * 失败
     *
     * @param code    错误码
     * @param message 错误信息
     * @return 响应体
     */
    public static BaseResponse<?> error(int code, String message) {
        return new BaseResponse<>(code, null, message);
    }

    /**
     * 失败
     *
     * @param message   错误信息
     * @param errorCode 错误码
     * @return 响应体
     */
    public static BaseResponse<?> error(String message, ErrorCode errorCode) {
        return new BaseResponse<>(errorCode.getCode(), null, message);
    }
}
