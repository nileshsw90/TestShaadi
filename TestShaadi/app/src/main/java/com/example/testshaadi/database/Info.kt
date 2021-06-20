package com.example.testshaadi.database

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.example.testshaadi.data.ResponseClass
import com.google.gson.annotations.SerializedName

@Entity(tableName = "info_table")
data class Info(
    @PrimaryKey
    @ColumnInfo(name = ResponseClass.SEED_STRING)
    @SerializedName(ResponseClass.SEED_STRING)
    var seed: String,
    @ColumnInfo(name = ResponseClass.RESULTS_STRING)
    @SerializedName(ResponseClass.RESULTS_STRING)
    var results: Int,
    @ColumnInfo(name = ResponseClass.PAGE_STRING)
    @SerializedName(ResponseClass.PAGE_STRING)
    var page: Int,
    @ColumnInfo(name = ResponseClass.VERSION_STRING)
    @SerializedName(ResponseClass.VERSION_STRING)
    var version: String
)
