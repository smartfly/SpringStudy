package com.smartfly.study.service;

import com.smartfly.study.domain.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

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
     * 获取用户分页列表
     * @param pageable
     * @return
     */
    Page<User> findByPage(Pageable pageable);

    /**
     * 新增用户
     * @param user
     * @return
     */
    User insertByUser(User user);

}
