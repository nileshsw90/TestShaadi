package com.example.testshaadi.database

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.example.testshaadi.data.ResponseClass
import com.example.testshaadi.data.ResponseClass.Companion.LOCATION_TABLE_STRING
import com.google.gson.annotations.SerializedName

@Entity(tableName = LOCATION_TABLE_STRING)
data class Location(
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = ResponseClass.SRNO_STRING)
    var srNo: Int,
    @ColumnInfo(name = ResponseClass.STREET_STRING)
    @SerializedName(ResponseClass.STREET_STRING)
    var street: Street,
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
    var postcode: String,
    @ColumnInfo(name = ResponseClass.COORDINATES_STRING)
    @SerializedName(ResponseClass.COORDINATES_STRING)
    var coordinates: Coordinates,
    @ColumnInfo(name = ResponseClass.TIMEZONE_STRING)
    @SerializedName(ResponseClass.TIMEZONE_STRING)
    var timezone: Timezone
)
