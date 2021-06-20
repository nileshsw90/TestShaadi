package com.example.testshaadi

import android.content.Context
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.room.Room
import com.example.testshaadi.data.ResponseData
import com.example.testshaadi.database.AppDatabase
import com.example.testshaadi.database.ResultsEntity
import com.example.testshaadi.repository.RestClient
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainActivity : AppCompatActivity() {

    private lateinit var adapter: RecyclerAdapter
    private lateinit var linearLayoutManager: LinearLayoutManager
    private var users: List<ResultsEntity> = emptyList()
    private lateinit var recyclerView: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        recyclerView = findViewById(R.id.rv_profile_details)

        linearLayoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        recyclerView.layoutManager = linearLayoutManager


        val call = RestClient().callCandidateList(10)

        val context: Context = this

        call.enqueue(object : Callback<ResponseData> {
            override fun onResponse(call: Call<ResponseData>, response: Response<ResponseData>) {
                val responseData = response.body() ?: return
                Log.e("MainActivity", "onResponse $responseData")
                val db = Room
                    .databaseBuilder(context, AppDatabase::class.java, "RoomBook")
                    .allowMainThreadQueries()
                    .build()

                val userDao = db.userDao()

                userDao.nukeTable()

                Log.e("MainActivity", "responseData " + responseData.results.size)

                for (i in 0..responseData.results.size - 1) {
                    val asdft: ResultsEntity = responseData.results[i]
                    userDao.insert(asdft)
                }
                users = userDao.getAllUsers()
                Log.e("MainActivity", "users " + users.size)

                adapter = RecyclerAdapter(context, users)
                recyclerView.adapter = adapter

            }

            override fun onFailure(call: Call<ResponseData>, t: Throwable) {
                Log.e("MainActivity", "onFailure")
            }
        })

    }

}