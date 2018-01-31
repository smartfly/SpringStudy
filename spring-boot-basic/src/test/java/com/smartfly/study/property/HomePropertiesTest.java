package com.smartfly.study.property;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created with IntelliJ IDEA.
 *
 * @author: hutao01
 * Date: 2017/12/28
 * Time: 10:05
 * Description: 自定义配置文件测试类
 * To change this template use File | Settings | File Templates | Includes | File Header
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class HomePropertiesTest {

    private static final org.slf4j.Logger LOGGER = LoggerFactory.getLogger(HomePropertiesTest.class);

    @Autowired
    private HomeProperties homeProperties;

    @Autowired
    private UserProperties userProperties;

    @Test
    public void getHomeProperties(){
        LOGGER.info("\n\n" + homeProperties.toString() + "\n");
    }

    @Test
    public void getUserProperties(){
        LOGGER.info("\n\n" + userProperties + "\n");
    }
}