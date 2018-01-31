package com.smartfly.study.dao;

import com.smartfly.study.domain.City;
import org.springframework.data.repository.query.Param;

/**
 * Created with IntelliJ IDEA.
 *
 * @author: hutao01
 * Date: 2018/1/3
 * Time: 20:15
 * Description: 城市 DAO 接口类
 * To change this template use File | Settings | File Templates | Includes | File Header
 */
public interface CityDao {

    City findByName(@Param("cityName") String cityName);

}
