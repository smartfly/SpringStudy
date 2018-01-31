package com.smartfly.study.property;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * Created with IntelliJ IDEA.
 *
 * @author: hutao01
 * Date: 2017/12/27
 * Time: 10:53
 * Description: 家乡属性配置
 * To change this template use File | Settings | File Templates | Includes | File Header
 */
@Component
@ConfigurationProperties(prefix = "home")
public class HomeProperties {
    /**
     * 省份
     */
    @Value("${home.province}")
    private String province;

    /**
     * 城市
     */
    @Value("${home.city}")
    private String city;

    /**
     * 描述
     */
    @Value("${home.desc}")
    private String desc;

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    @Override
    public String toString() {
        return "HomeProperties{" +
                "province='" + province + "\'" +
                ", city='" + city + "\'" + "\'" +
                ", desc='" + desc + "\'" +
                "}";
    }
}
