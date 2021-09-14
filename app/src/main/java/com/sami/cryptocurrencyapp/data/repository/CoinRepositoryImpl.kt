package com.sami.cryptocurrencyapp.data.repository

import com.sami.cryptocurrencyapp.data.remote.CoinPaprikaApi
import com.sami.cryptocurrencyapp.data.remote.dto.CoinDetailDto
import com.sami.cryptocurrencyapp.data.remote.dto.CoinDto
import com.sami.cryptocurrencyapp.domain.repository.CoinRepository
import javax.inject.Inject

class CoinRepositoryImpl @Inject constructor(
    private val api: CoinPaprikaApi
) : CoinRepository {
    override suspend fun getCoins(): List<CoinDto> {
        return api.getCoins()
    }

    override suspend fun getCoinById(coinId: String): CoinDetailDto {
        return api.getCoinById(coinId)
    }
}