package com.qxf.springbootdemo.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/www")
@Api(value="用户模块")
public class HelloController {

    @ApiOperation(value = "根据id查询学生信息", notes = "查询数据库中某个的学生信息")
    @ApiImplicitParam(name = "id", value = "学生ID", paramType = "path", required = true, dataType = "String")
    @RequestMapping(value="/hello/{id}",method = RequestMethod.GET,produces="text/html;charset=UTF-8")
    @ResponseBody
    public String hello(@PathVariable String id) {
        return "Hello Spring Boot "+id+"!";
    }

    @ApiOperation(value = "添加用户")
    @RequestMapping("/go")
    public String hello1() {
        return "Hello Spring www1";
    }





}
