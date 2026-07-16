package com.shancj.cloudpicturebackend.exception;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.shancj.cloudpicturebackend.common.BaseResponse;
import com.shancj.cloudpicturebackend.common.ResultUtils;

@RestControllerAdvice
@Slf4j
public class GlobalExceptionHandler {

    @ExceptionHandler(BusinessException.class)
    public BaseResponse<?> businessExceptionHandler(BusinessException e) {
        log.error("BusinessException", e);
        return ResultUtils.error(e.getCode(), e.getMessage());
    }
    
    @ExceptionHandler(Exception.class)
    public BaseResponse<?> runtimeExceptionHandler(Exception e) {
        log.error("Exception", e);
        return ResultUtils.error("系统错误", ErrorCode.SYSTEM_ERROR);
    }
}
