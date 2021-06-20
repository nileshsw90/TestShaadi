package com.example.testshaadi.database

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.example.testshaadi.data.ResponseClass
import com.google.gson.annotations.SerializedName

@Entity(tableName = "location_table")
data class LocationEntity(
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = ResponseClass.SRNO_STRING)
    var srNo: Int,
    @ColumnInfo(name = ResponseClass.STREET_STRING)
    @SerializedName(ResponseClass.STREET_STRING)
    var street: StreetEntity,
    @ColumnInfo(name = ResponseClass.CITY_STRING)
    @SerializedName(ResponseClass.CITY_STRING)
    var city: String,
    @ColumnInfo(name = ResponseClass.STATE_STRING)
    @SerializedName(ResponseClass.STATE_STRING)
    var state: String,
    @ColumnInfo(name = ResponseClass.COUNTRY_STRING)
    @SerializedName(ResponseClass.COUNTRY_STRING)
    var country: String,
    @ColumnInfo(name = ResponseClass.POSTCODE_STRING)
    @SerializedName(ResponseClass.POSTCODE_STRING)
    var postcode: Int,
    @ColumnInfo(name = ResponseClass.COORDINATES_STRING)
    @SerializedName(ResponseClass.COORDINATES_STRING)
    var coordinates: CoordinatesEntity,
    @ColumnInfo(name = ResponseClass.TIMEZONE_STRING)
    @SerializedName(ResponseClass.TIMEZONE_STRING)
    var timezone: TimezoneEntity
)
