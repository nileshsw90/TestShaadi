package com.example.testshaadi.database

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.example.testshaadi.data.ResponseClass
import com.example.testshaadi.data.ResponseClass.Companion.RESULTS_TABLE_STRING
import com.google.gson.annotations.SerializedName

@Entity(tableName = RESULTS_TABLE_STRING)
data class Results(

    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = ResponseClass.SRNO_STRING)
    var srNo: Int,
    @ColumnInfo(name = ResponseClass.EMAIL_STRING)
    @SerializedName(ResponseClass.EMAIL_STRING)
    var email: String,
    @ColumnInfo(name = ResponseClass.GENDER_STRING)
    @SerializedName(ResponseClass.GENDER_STRING)
    var gender: String,
    @ColumnInfo(name = ResponseClass.NAME_STRING)
    @SerializedName(ResponseClass.NAME_STRING)
    var name: Name,
    @ColumnInfo(name = ResponseClass.LOCATION_STRING)
    @SerializedName(ResponseClass.LOCATION_STRING)
    var location: Location,
    @ColumnInfo(name = ResponseClass.LOGIN_STRING)
    @SerializedName(ResponseClass.LOGIN_STRING)
    var login: Login,
    @ColumnInfo(name = ResponseClass.DOB_STRING)
    @SerializedName(ResponseClass.DOB_STRING)
    var dob: Dob,
    @ColumnInfo(name = ResponseClass.REGISTERED_STRING)
    @SerializedName(ResponseClass.REGISTERED_STRING)
    var registered: Registered,
    @ColumnInfo(name = ResponseClass.PHONE_STRING)
    @SerializedName(ResponseClass.PHONE_STRING)
    var phone: String,
    @ColumnInfo(name = ResponseClass.CELL_STRING)
    @SerializedName(ResponseClass.CELL_STRING)
    var cell: String,
    @ColumnInfo(name = ResponseClass.ID_STRING)
    @SerializedName(ResponseClass.ID_STRING)
    var id: Id,
    @ColumnInfo(name = ResponseClass.PICTURE_STRING)
    @SerializedName(ResponseClass.PICTURE_STRING)
    var picture: Picture,
    @ColumnInfo(name = ResponseClass.NAT_STRING)
    @SerializedName(ResponseClass.NAT_STRING)
    var nat: String
)
