package com.sami.cryptocurrencyapp.data.remote

import com.sami.cryptocurrencyapp.data.remote.dto.CoinDetailDto
import com.sami.cryptocurrencyapp.data.remote.dto.CoinDto
import retrofit2.http.GET
import retrofit2.http.Path

//Helpful for test cases
interface CoinPaprikaApi {

    @GET("/v1/coins")
    suspend fun getCoins(): List<CoinDto>

    @GET("/v1/coins/{coinId}")
    suspend fun getCoinById(@Path("coinId") coinId: String): CoinDetailDto
}