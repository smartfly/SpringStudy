package com.smartfly.study.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created with IntelliJ IDEA.
 *
 * @author: hutao01
 * Date: 2017/12/26
 * Time: 10:16
 * Description:
 * To change this template use File | Settings | File Templates | Includes | File Header
 */
/*@RestController：提供实现了REST API, 可以服务JSON,XML或其他，这里是以String的形式渲染出结果*/
@RestController
public class HelloController {

    /*@RequestMapping：提供路由信息，"/"路径的HTTP Request都会被映射到index()方法进行处理*/
    @RequestMapping("/")
    public String index(){
        return "Greetings from Spring Boot!";
    }
}
