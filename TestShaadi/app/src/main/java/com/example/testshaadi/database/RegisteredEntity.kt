package com.example.testshaadi.database

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.example.testshaadi.data.ResponseClass
import com.google.gson.annotations.SerializedName

@Entity(tableName = "registered_table")
data class RegisteredEntity(
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = ResponseClass.SRNO_STRING)
    var srNo: Int,
    @ColumnInfo(name = ResponseClass.DATE_STRING)
    @SerializedName(ResponseClass.DATE_STRING)
    var date: String,
    @ColumnInfo(name = ResponseClass.AGE_STRING)
    @SerializedName(ResponseClass.AGE_STRING)
    var age: Int
)
