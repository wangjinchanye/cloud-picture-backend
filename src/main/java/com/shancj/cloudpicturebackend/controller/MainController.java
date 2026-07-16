package com.shancj.cloudpicturebackend.controller;

import com.shancj.cloudpicturebackend.annotation.AuthCheck;
import com.shancj.cloudpicturebackend.common.BaseResponse;
import com.shancj.cloudpicturebackend.common.ResultUtils;
import com.shancj.cloudpicturebackend.model.constant.UserConstant;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class MainController {

    /**
     * 健康检查
     */
    @GetMapping("/health")
    @AuthCheck(mustRole = UserConstant.ADMIN_ROLE)
    public BaseResponse<String> health() {
        return ResultUtils.success("ok");
    }
}
