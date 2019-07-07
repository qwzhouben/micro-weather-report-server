package com.zben.cloud.weather.service;

import com.zben.cloud.weather.vo.Weather;
import com.zben.cloud.weather.vo.WeatherResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @DESC: Weather Report ServiceImpl
 * @AUTHOR: jhon.zhou
 * @DATE: 2019/7/7 0007 12:17
 */
@Service
public class WeatherReportServiceImpl implements WeatherReportService {

    @Override
    public Weather getWeatherByCityId(String cityId) {
        //TODO：之后根据天气数据服务API
        Weather weather = Weather.builder()
                .city("广州")
                .aqi("22")
                .wendu("32°")
                .ganmao("天气良好")
                .build();
        return weather;
    }
}
