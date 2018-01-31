package com.smartfly.study.service.impl;

import com.smartfly.study.dao.CityDao;
import com.smartfly.study.domain.City;
import com.smartfly.study.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created with IntelliJ IDEA.
 *
 * @author: hutao01
 * Date: 2018/1/3
 * Time: 20:14
 * Description: 城市业务逻辑实现类
 * To change this template use File | Settings | File Templates | Includes | File Header
 */
@Service
public class CityServiceImpl implements CityService{

    @Autowired
    private CityDao cityDao;

    @Override
    public City findCityByName(String cityName){
        return cityDao.findByName(cityName);
    }

}
