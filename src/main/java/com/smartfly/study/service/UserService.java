package com.smartfly.study.service;

import com.smartfly.study.domain.User;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @author: hutao01
 * Date: 2017/12/28
 * Time: 20:30
 * Description: 业务层接口
 * To change this template use File | Settings | File Templates | Includes | File Header
 */
public interface UserService {

    List<User> findAll();

    User insertByUser(User user);

    User update(User user);

    User delete(Long id);

    User findById(Long id);

}
