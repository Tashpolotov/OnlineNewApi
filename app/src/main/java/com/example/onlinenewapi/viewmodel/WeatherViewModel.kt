package com.example.onlinenewapi.viewmodel

import androidx.lifecycle.ViewModel
import com.example.domain.model.WeatherInDay
import com.example.domain.repository.WeatherRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import javax.inject.Inject

@HiltViewModel
class WeatherViewModel @Inject constructor(private val repository: WeatherRepository): ViewModel() {

    private val _weatherInDay = MutableStateFlow<WeatherInDay?>(null)
    val weatherInDay : StateFlow<WeatherInDay?> = _weatherInDay

    fun getLoadWeatherToday() {
        val result = repository.getWeatherToday()
        _weatherInDay.value = result.value

    }

}