package com.smartfly.study.controller;

import com.smartfly.study.domain.User;
import com.smartfly.study.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created with IntelliJ IDEA.
 *
 * @author: hutao01
 * Date: 2017/12/28
 * Time: 20:26
 * Description: 用户控制层
 * To change this template use File | Settings | File Templates | Includes | File Header
 */
@Controller
/*通过这里配置是下面的映射都在users下面*/
@RequestMapping(value = "/users")
public class UserController {

    /*用户服务层*/
    @Autowired
    UserService userService;

    /**
     * 获取用户列表
     *      处理"/users"的GET请求，用来获取用户列表
     *      通过@RequestParam传递参数，进一步实现条件查询或者分页查询
     * @param map
     * @return
     */
    @RequestMapping(method = RequestMethod.GET)
    public String getUserList(ModelMap map){
        map.addAttribute("userList", userService.findAll());
        return "userList";
    }

    /**
     * 显示创建用户表单
     * @param map
     * @return
     */
    @RequestMapping(value = "/create", method = RequestMethod.GET)
    public String createUserForm(ModelMap map){
        map.addAttribute("user", new User());
        map.addAttribute("action", "create");
        return "userForm";
    }

    /**
     * 创建用户
     *      处理"/users"的POST请求，用来获取用户列表
     *      通过@ModelAttribute绑定参数，也通过@RequestParam从页面中传递参数
     * @param user
     * @return
     */
    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public String postUser(@ModelAttribute User user){
        userService.insertByUser(user);
        return "redirect:/users/";
    }

    /**
     * 显示需要更新用户表单
     *      处理 "/users/{id}"的GET请求，通过URL中的id值获取User信息
     *      URL中id，通过@PathVariable绑定参数
     * @param id
     * @param map
     * @return
     */
    @RequestMapping(value = "/update/{id}", method = RequestMethod.GET)
    public String getUser(@PathVariable Long id, ModelMap map){
        map.addAttribute("user", userService.findById(id));
        map.addAttribute("action", "update");
        return "userForm";
    }

    /**
     * 处理"/update"的POST请求,用来更新User信息
     * @param user
     * @return
     */
    @RequestMapping(value = "/update", method = RequestMethod.POST)
    public String putUser(@ModelAttribute User user){
        userService.update(user);
        return "redirect:/users/";
    }

    /**
     * 处理 "/delete/{id}" 的 GET 请求，用来删除 User 信息
     * @param id
     * @return
     */
    @RequestMapping(value = "/delete/{id}", method = RequestMethod.GET)
    public String deleteUser(@PathVariable Long id){
        userService.delete(id);
        return "redirect:/users/";
    }

}
