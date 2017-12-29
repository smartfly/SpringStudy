package com.smartfly.study;

import com.smartfly.study.domain.User;
import com.smartfly.study.domain.UserRepository;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created with IntelliJ IDEA.
 *
 * @author: hutao01
 * Date: 2017/12/29
 * Time: 9:36
 * Description:
 * To change this template use File | Settings | File Templates | Includes | File Header
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class UserRepositoryTests {

    @Autowired
    UserRepository userRepository;

    @Test
    public void testSave(){
        User user = new User();
        user.setName("路飞");
        user.setAge(21);
        user.setBirthday("1995-11-14");
        user = userRepository.save(user);
        /*验证新增用户*/
        Assert.assertNotNull(user.getId());
    }

}
