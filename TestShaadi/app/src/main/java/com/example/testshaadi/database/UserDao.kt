package com.example.testshaadi.database

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import com.example.testshaadi.data.ResponseClass

@Dao
interface UserDao {

    @Query("SELECT * from results_table")
    fun getAllUsers(): List<Results>

    /*@Query("SELECT * FROM user WHERE uid IN (:userIds)")
    fun loadAllByIds(userIds: IntArray): List<Results>

    @Query(
        "SELECT * FROM user WHERE first_name LIKE :first AND " +
                "last_name LIKE :last LIMIT 1"
    )
    fun findByName(first: String, last: String): User*/

    @Insert
    fun insert(users: Results)

    @Delete
    fun delete(user: Results)

    @Query("DELETE FROM results_table")
    fun nukeTable()

}