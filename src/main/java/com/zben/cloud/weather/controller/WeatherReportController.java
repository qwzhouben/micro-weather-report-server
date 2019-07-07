package com.zben.cloud.weather.controller;

import com.zben.cloud.weather.service.WeatherReportService;
import com.zben.cloud.weather.vo.City;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

/**
 * @DESC: Weather ReportController
 * @AUTHOR: jhon.zhou
 * @DATE: 2019/7/7 0007 12:19
 */
@Controller
@RequestMapping("/report")
public class WeatherReportController {

    @Autowired
    WeatherReportService weatherReportService;

    @GetMapping(value = "/cityId/{cityId}")
    public ModelAndView getReportByCityId(@PathVariable("cityId") String cityId, Model model) throws Exception {
        //TODO: 之后调用城市服务API
        List<City> cityList = new ArrayList<>();
        City city = new City();
        city.setCityId("101280101");
        city.setCityName("广州");
        cityList.add(city);
        model.addAttribute("title", "老周老笨的天气预报");
        model.addAttribute("cityId", cityId);
        model.addAttribute("cityList", cityList);
        model.addAttribute("report", weatherReportService.getWeatherByCityId(cityId));
        return new ModelAndView("weather/report", "reportModel", model);
    }
}
