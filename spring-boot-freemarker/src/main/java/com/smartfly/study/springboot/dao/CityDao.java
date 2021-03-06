package com.smartfly.study.springboot.dao;

import com.smartfly.study.springboot.domain.City;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @author: hutao01
 * Date: 2018/2/6
 * Time: 10:53
 * Description: 城市DAO接口类
 * To change this template use File | Settings | File Templates | Includes | File Header
 */
public interface CityDao {

    /**
     * 获取城市信息列表
     * @return
     */
    List<City> findAllCity();

    /**
     * 根据城市ID，获取城市信息
     * @param id
     * @return
     */
    City findById(@Param("id") Long id);

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
     * 删除城市信息
     * @param id
     * @return
     */
    Long deleteCity(Long id);

}
