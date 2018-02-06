package com.smartfly.study.springboot.service.impl;

import com.smartfly.study.springboot.dao.CityDao;
import com.smartfly.study.springboot.domain.City;
import com.smartfly.study.springboot.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @author: hutao01
 * Date: 2018/2/6
 * Time: 10:52
 * Description: 城市业务逻辑实现类
 * To change this template use File | Settings | File Templates | Includes | File Header
 */
@Service
public class CityServiceImpl implements CityService{

    @Autowired
    private CityDao cityDao;


    @Override
    public List<City> findAllCity() {
        return cityDao.findAllCity();
    }

    @Override
    public City findCityById(Long id) {
        return cityDao.findById(id);
    }

    @Override
    public Long saveCity(City city) {
        return cityDao.saveCity(city);
    }

    @Override
    public Long updateCity(City city) {
        return cityDao.updateCity(city);
    }

    @Override
    public Long deleteCity(Long id) {
        return cityDao.deleteCity(id);
    }
}
