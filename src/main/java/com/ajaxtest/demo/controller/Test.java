package com.ajaxtest.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;

/**
 * @Author:hepo
 * @Version:v1.0
 * @Description:
 * @Date:2018/9/19/019
 * @Time:10:42
 */
@RestController
public class Test {

    @GetMapping("")
    public String getAjaxMsg(){

        return "success1";
    }

}
