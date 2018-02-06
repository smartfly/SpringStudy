package com.smartfly.study.springboot.web;

import com.smartfly.study.springboot.constant.CityErrorInfoEnum;
import com.smartfly.study.springboot.result.GlobalErrorInfoException;
import com.smartfly.study.springboot.result.ResultBody;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created with IntelliJ IDEA.
 *
 * @author: hutao01
 * Date: 2018/2/6
 * Time: 15:05
 * Description: 错误码案例
 * To change this template use File | Settings | File Templates | Includes | File Header
 */
@RestController
public class ErrorJsonController {

    /**
     * 获取城市接口
     * @param cityName
     * @return
     * @throws GlobalErrorInfoException
     */
    @RequestMapping(value = "/api/city", method = RequestMethod.GET)
    public ResultBody findOneCity(@RequestParam("cityName") String cityName) throws GlobalErrorInfoException{
        /*入参为空*/
        if(StringUtils.isEmpty(cityName)){
            throw new GlobalErrorInfoException(CityErrorInfoEnum.PARAMS_NO_COMPLETE);
        }

        return new ResultBody(new City(2L, 3L, "深圳", "我想去的城市"));
    }

}
