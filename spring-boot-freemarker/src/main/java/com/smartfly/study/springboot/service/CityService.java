package com.smartfly.study.springboot.service;

import com.smartfly.study.springboot.domain.City;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @author: hutao01
 * Date: 2018/2/6
 * Time: 10:44
 * Description: 城市业务逻辑接口类
 * To change this template use File | Settings | File Templates | Includes | File Header
 */
public interface CityService {

    /**
     * 获取城市信息列表
     * @return
     */
    List<City> findAllCity();

    /**
     * 根据城市ID，查询城市信息
     * @param id
     * @return
     */
    City findCityById(Long id);

    /**
     * 新增城市信息
     * @param city
     * @return
     */
    Long saveCity(City city);

    /**
     * 更新城市信息
     * @param city
     * @return
     */
    Long updateCity(City city);

    /**
     * 根据城市ID，删除城市信息
     * @param id
     * @return
     */
    Long deleteCity(Long id);

}
