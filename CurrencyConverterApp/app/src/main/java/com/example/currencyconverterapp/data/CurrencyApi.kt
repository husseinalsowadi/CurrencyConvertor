package com.example.currencyconverterapp.data

import com.example.currencyconverterapp.data.models.CurrencyResponse
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface CurrencyApi {

    @GET("/exchangerates_data/latest?apikey=J9VVW8Pl9SzRECoCcMET4o7rYkM7N7Cz")
    suspend fun getRates(@Query("base") base : String):Response<CurrencyResponse>
}