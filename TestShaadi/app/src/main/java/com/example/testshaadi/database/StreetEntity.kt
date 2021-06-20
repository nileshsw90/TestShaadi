package com.example.testshaadi.database

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.example.testshaadi.data.ResponseClass
import com.google.gson.annotations.SerializedName

@Entity(tableName = "street_table")
data class StreetEntity(
    @PrimaryKey
    @ColumnInfo(name = ResponseClass.NUMBER_STRING)
    @SerializedName(ResponseClass.NUMBER_STRING)
    var number: Int,
    @ColumnInfo(name = ResponseClass.NAME_STRING)
    @SerializedName(ResponseClass.NAME_STRING)
    var name: String
)
