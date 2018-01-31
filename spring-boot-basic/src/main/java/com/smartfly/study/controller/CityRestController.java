package com.smartfly.study.controller;

import com.smartfly.study.domain.City;
import com.smartfly.study.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created with IntelliJ IDEA.
 *
 * @author: hutao01
 * Date: 2018/1/3
 * Time: 20:22
 * Description:
 * To change this template use File | Settings | File Templates | Includes | File Header
 */
@RestController
public class CityRestController {

    @Autowired
    private CityService cityService;

    @RequestMapping(value = "/api/city", method = RequestMethod.GET)
    public City findOneCity(@RequestParam(value = "cityName", required = true) String cityName){
        return cityService.findCityByName(cityName);
    }

}
