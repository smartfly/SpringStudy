package com.smartfly.study.controller;

import com.smartfly.study.domain.User;
import com.smartfly.study.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

/**
 * Created with IntelliJ IDEA.
 *
 * @author: hutao01
 * Date: 2017/12/28
 * Time: 20:26
 * Description: 用户控制层
 * To change this template use File | Settings | File Templates | Includes | File Header
 */
@RestController
/*通过这里配置是下面的映射都在users下面*/
@RequestMapping(value = "/users")
public class UserController {

    /*用户服务层*/
    @Autowired
    UserService userService;

    /**
     * 获取用户分页列表
     *      处理"/users"的GET请求，用来获取用户分页列表
     *      通过@RequestParam 传递参数，进一步实现条件查询或者分页查询
     *
     *      Pageable 支持的分页参数如下
     *      page - 当前页 从 0 开始
     *      size - 每页大小 默认值在 application.properties 配置
     * @param pageable
     * @return
     */
    @RequestMapping(method = RequestMethod.GET)
    public Page<User> getUserPage(Pageable pageable){
        return userService.findByPage(pageable);
    }

    /**
     * 创建用户
     *      处理"/users"的PSOT请求，用来获取用户列表
     *      通过@RequestBody 绑定实体类参数
     * @param user
     * @return
     */
    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public User postUser(@RequestBody User user){
        return userService.insertByUser(user);
    }

}
