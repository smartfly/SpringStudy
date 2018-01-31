package com.smartfly.study.domain;

/**
 * Created with IntelliJ IDEA.
 *
 * @author: hutao01
 * Date: 2018/1/3
 * Time: 20:09
 * Description: 城市实体类
 * To change this template use File | Settings | File Templates | Includes | File Header
 */
public class City {

    /**
     * 城市编号
     */
    private long id;

    /**
     * 省份编号
     */
    private long provinceId;

    /**
     * 城市名称
     */
    private String cityName;

    /**
     * 描述
     */
    private String description;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getProvinceId() {
        return provinceId;
    }

    public void setProvinceId(long provinceId) {
        this.provinceId = provinceId;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
