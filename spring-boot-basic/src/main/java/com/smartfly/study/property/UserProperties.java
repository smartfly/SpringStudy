package com.smartfly.study.property;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * Created with IntelliJ IDEA.
 *
 * @author: hutao01
 * Date: 2017/12/28
 * Time: 10:36
 * Description: 用户属性
 * To change this template use File | Settings | File Templates | Includes | File Header
 */
@Component
@ConfigurationProperties(prefix = "user")
public class UserProperties {

    /**
     * 用户ID
     */
    @Value("${user.id}")
    private long id;

    /**
     * 年龄
     */
    @Value("${user.age}")
    private int age;

    /**
     * 用户 UUID
     */
    @Value("${user.uuid}")
    private String uuid;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    @Override
    public String toString() {
        return uuid;
    }
}
