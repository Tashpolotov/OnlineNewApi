package com.example.data.repository

import com.example.domain.model.WeatherInDay
import com.example.domain.model.WeatherInHour
import com.example.domain.repository.WeatherRepository
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow

class WeatherRepositoryImpl: WeatherRepository {



    private val weatherToday = MutableStateFlow<WeatherInDay?>(null)

    private val weatherSevenDay = MutableStateFlow(emptyList<WeatherInDay>())

    private val weatherInhourToday = MutableStateFlow(emptyList<WeatherInHour>())

    private val weatherInHourTomorrow = MutableStateFlow(emptyList<WeatherInHour>())


    override fun getWeatherToday(): StateFlow<WeatherInDay?> {
        return weatherToday
    }

    override fun getWeatherSevenDays(): StateFlow<List<WeatherInDay>> {
        return weatherSevenDay
    }

    override fun getWeatherInHourToday(): StateFlow<List<WeatherInHour>> {
        return weatherInhourToday
    }

    override fun getWeatherInHourTomorrow(): StateFlow<List<WeatherInHour>> {
        return weatherInHourTomorrow
    }

    override fun loadWeatherToday() {

    }

    override fun loadWeatherForWeek() {

    }
}