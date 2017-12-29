package com.smartfly.study.service.impl;

import com.smartfly.study.domain.User;
import com.smartfly.study.domain.UserRepository;
import com.smartfly.study.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @author: hutao01
 * Date: 2017/12/28
 * Time: 20:40
 * Description: 业务层实现
 * To change this template use File | Settings | File Templates | Includes | File Header
 */
@Service
public class UserServiceImpl implements UserService{

    private static final Logger LOGGER = LoggerFactory.getLogger(UserServiceImpl.class);

    @Autowired
    UserRepository userRepository;

    @Override
    public List<User> findAll() {
        return userRepository.findAll();
    }

    @Override
    public User insertByUser(User user) {
        LOGGER.info("新增用户: " + user.toString());
        return userRepository.save(user);
    }

    @Override
    public User update(User user) {
        LOGGER.info("更新用户: " + user.toString());
        return userRepository.save(user);
    }

    @Override
    public User delete(Long id) {
        User user = userRepository.getOne(id);
        userRepository.delete(user);
        LOGGER.info("删除用户: " + user.toString());
        return user;
    }

    @Override
    public User findById(Long id) {
        LOGGER.info("获取用户ID: " + id);
        return userRepository.findOne(id);
    }
}
