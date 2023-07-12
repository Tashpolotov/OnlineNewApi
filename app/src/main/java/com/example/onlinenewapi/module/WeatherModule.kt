package com.example.onlinenewapi.module

import com.example.data.repository.WeatherRepositoryImpl
import com.example.domain.repository.WeatherRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent


@Module
@InstallIn(SingletonComponent::class)
class WeatherModule {

    @Provides
    fun getRepository() : WeatherRepository{
        return WeatherRepositoryImpl()
    }
}