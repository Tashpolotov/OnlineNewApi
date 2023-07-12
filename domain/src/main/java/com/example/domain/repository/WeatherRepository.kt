package com.example.domain.repository

import com.example.domain.model.WeatherInDay
import com.example.domain.model.WeatherInHour
import kotlinx.coroutines.flow.StateFlow

interface WeatherRepository  {

    fun getWeatherToday() :  StateFlow<WeatherInDay?>

    fun getWeatherSevenDays() : StateFlow<List<WeatherInDay>>

    fun getWeatherInHourToday() : StateFlow<List<WeatherInHour>>

    fun getWeatherInHourTomorrow() : StateFlow<List<WeatherInHour>>

    fun loadWeatherToday()

    fun loadWeatherForWeek()

}