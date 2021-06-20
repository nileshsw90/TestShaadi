package com.example.testshaadi.repository

import com.example.testshaadi.data.ResponseData
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface CandidateListService {

    @GET("api/")
    fun getCandidateList(@Query("results") result: Int): Call<ResponseData>

}