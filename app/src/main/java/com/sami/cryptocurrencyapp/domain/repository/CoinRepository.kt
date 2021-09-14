package com.sami.cryptocurrencyapp.domain.repository

import com.sami.cryptocurrencyapp.data.remote.dto.CoinDetailDto
import com.sami.cryptocurrencyapp.data.remote.dto.CoinDto

interface CoinRepository {

    suspend fun getCoins(): List<CoinDto>

    suspend fun getCoinById(coinId: String): CoinDetailDto
}