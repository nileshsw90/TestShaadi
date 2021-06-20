package com.example.testshaadi.database

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.example.testshaadi.data.ResponseClass
import com.google.gson.annotations.SerializedName

@Entity(tableName = "coordinates_table")
data class Coordinates(
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = ResponseClass.SRNO_STRING)
    var srNo: Int,
    @ColumnInfo(name = ResponseClass.LATITUDE_STRING)
    @SerializedName(ResponseClass.LATITUDE_STRING)
    var latitude: String,
    @ColumnInfo(name = ResponseClass.LONGITUDE_STRING)
    @SerializedName(ResponseClass.LONGITUDE_STRING)
    var longitude: String
)
