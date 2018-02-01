package com.smartfly.study.domain;

import org.springframework.data.repository.PagingAndSortingRepository;

/**
 * Created with IntelliJ IDEA.
 *
 * @author: hutao01
 * Date: 2017/12/28
 * Time: 20:42
 * Description: 用户持久层操作接口
 * To change this template use File | Settings | File Templates | Includes | File Header
 */
public interface UserRepository extends PagingAndSortingRepository<User, Long> {

}
