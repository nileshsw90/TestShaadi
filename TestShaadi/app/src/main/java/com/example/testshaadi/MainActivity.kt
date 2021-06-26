package com.example.testshaadi

import android.os.Bundle
import android.util.Log
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.room.Room
import com.example.testshaadi.data.ResponseClass
import com.example.testshaadi.data.ResponseData
import com.example.testshaadi.database.AppDatabase
import com.example.testshaadi.database.Results
import com.example.testshaadi.viewmodels.UserViewModel
import retrofit2.Call
import retrofit2.Response

class MainActivity : AppCompatActivity() {

    private lateinit var adapter: RecyclerAdapter
    private lateinit var linearLayoutManager: LinearLayoutManager
    private var users: List<Results> = emptyList()
    private lateinit var recyclerView: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView = findViewById(R.id.rv_profile_details)

        linearLayoutManager = LinearLayoutManager(
            this, LinearLayoutManager.HORIZONTAL,
            false
        )
        recyclerView.layoutManager = linearLayoutManager

        val profileViewModel: UserViewModel by viewModels()
        profileViewModel.fetchUserDetails(10)
        Log.e("MainActivity", "onResponse ${profileViewModel.userData.value?.size}")

        val db = Room
            .databaseBuilder(application, AppDatabase::class.java, ResponseClass.DATABASE_NAME)
            .allowMainThreadQueries()
            .build()

        val userDao = db.userDao()

        //userDao.nukeTable()

        profileViewModel.userData.observe(this, Observer {
            for (i in 0..profileViewModel.userData.value!!.size - 1) {
                userDao.insert(profileViewModel.userData.value!!.get(i))
            }

            users = userDao.getAllUsers()

            Log.e("MainActivity", "users " + users.size)
            adapter = RecyclerAdapter(this, users)
            recyclerView.adapter = adapter

        })

    }

}