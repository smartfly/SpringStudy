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
    /**
     * 查找所有用户
     * @return
     */
    List<User> findAll();

    /**
     * 插入一个新用户
     * @param user
     * @return
     */
    User insertByUser(User user);

    /**
     * 更新一个用户
     * @param user
     * @return
     */
    User update(User user);

    /**
     * 删除一个用户
     * @param id
     * @return
     */
    User delete(Long id);

    /**
     * 根据ID查找用户
     * @param id
     * @return
     */
    User findById(Long id);

}
