package com.springcloud.consumer.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;

import org.springframework.web.bind.annotation.*;

@Api(value = "AdminUserController", tags="测试接口模块")
@RestController
@RequestMapping("/admin/user")
public class UserController{
    /**
     * 用户登录
     */
    @ApiOperation(value = "登录")
    @ApiImplicitParams({@ApiImplicitParam(name = "userName", value = "用户名", required = true, dataType = "String",defaultValue="11"),
            @ApiImplicitParam(name = "password", value = "密码", required = true, dataType = "String", defaultValue="22")})
    @GetMapping("/login")
    public String login(String userName, String password){
    	return "11";
    }
}
