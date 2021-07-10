package com.example.testshaadi.viewmodels

import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.testshaadi.data.ResponseData
import com.example.testshaadi.database.Results
import com.example.testshaadi.repository.RestClient
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class UserViewModel : ViewModel(), Callback<ResponseData> {

    var userData = MutableLiveData<List<Results>>()

    fun fetchUserDetails(pageListSize: Int) {
        RestClient().callCandidateList(pageListSize).enqueue(this)
    }

    override fun onResponse(call: Call<ResponseData>, response: Response<ResponseData>) {
        val responseData = response.body() ?: return
        userData.value = responseData.results
        Log.e("UserViewModel", "responseData " + userData.value!!.size)
    }

    override fun onFailure(call: Call<ResponseData>, t: Throwable) {
        Log.e("UserViewModel", "onFailure ${call.isExecuted} ${t.message}")
    }

}