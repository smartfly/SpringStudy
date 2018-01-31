package com.smartfly.study.service;

import com.smartfly.study.domain.City;

/**
 * Created with IntelliJ IDEA.
 *
 * @author: hutao01
 * Date: 2018/1/3
 * Time: 20:12
 * Description: 城市业务逻辑接口
 * To change this template use File | Settings | File Templates | Includes | File Header
 */
public interface CityService {

    /**
     * 根据城市名称查询城市信息
     * @param cityName
     * @return
     */
    City findCityByName(String cityName);

}
