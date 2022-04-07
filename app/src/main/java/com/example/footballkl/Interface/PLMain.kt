package com.example.footballkl.Interface

import com.example.footballkl.PL.PLModel.MainPLModel
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Headers

interface PLMain {

    // https://api.football-data.org/v2/competitions/2019

    @get:GET("v2/competitions/2021")
    @get:Headers("X-Auth-Token: 161d94ea5ccd478596a33f51876bd457")

    val mainPLCall : Call<MainPLModel>

}