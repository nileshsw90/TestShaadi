package com.example.testshaadi.database

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.example.testshaadi.data.ResponseClass
import com.example.testshaadi.data.ResponseClass.Companion.REGISTERED_TABLE_STRING
import com.google.gson.annotations.SerializedName

@Entity(tableName = REGISTERED_TABLE_STRING)
data class Registered(
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
