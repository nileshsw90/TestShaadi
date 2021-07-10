package com.example.testshaadi

import android.os.Bundle
import android.util.Log
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.room.Room
import com.example.testshaadi.data.ResponseClass
import com.example.testshaadi.database.AppDatabase
import com.example.testshaadi.database.Results
import com.example.testshaadi.databinding.ActivityMainBinding
import com.example.testshaadi.viewmodels.UserViewModel

class MainActivity : AppCompatActivity() {

    private lateinit var adapter: RecyclerAdapter
    private lateinit var linearLayoutManager: LinearLayoutManager
    private var users: List<Results> = emptyList()
    private lateinit var activityMainBinding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        activityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        linearLayoutManager = LinearLayoutManager(
            this, LinearLayoutManager.HORIZONTAL,
            false
        )
        activityMainBinding.rvProfileDetails.layoutManager = linearLayoutManager

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

            for (i in it!!.indices) {
                userDao.insert(it.get(i))
            }

            users = userDao.getAllUsers()

            Log.e("MainActivity", "users " + users.size)
            adapter = RecyclerAdapter(this, users)
            activityMainBinding.rvProfileDetails.adapter = adapter

        })

    }

}