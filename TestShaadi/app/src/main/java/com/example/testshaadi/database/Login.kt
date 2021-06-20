package com.example.testshaadi.database

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.example.testshaadi.data.ResponseClass
import com.google.gson.annotations.SerializedName

@Entity(tableName = "login_table")
data class Login(
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = ResponseClass.SRNO_STRING)
    var srNo: Int,
    @ColumnInfo(name = ResponseClass.UUID_STRING)
    @SerializedName(ResponseClass.UUID_STRING)
    var uuid: String,
    @ColumnInfo(name = ResponseClass.USERNAME_STRING)
    @SerializedName(ResponseClass.USERNAME_STRING)
    var username: String,
    @ColumnInfo(name = ResponseClass.PASSWORD_STRING)
    @SerializedName(ResponseClass.PASSWORD_STRING)
    var password: String,
    @ColumnInfo(name = ResponseClass.SALT_STRING)
    @SerializedName(ResponseClass.SALT_STRING)
    var salt: String,
    @ColumnInfo(name = ResponseClass.MD5_STRING)
    @SerializedName(ResponseClass.MD5_STRING)
    var md5: String,
    @ColumnInfo(name = ResponseClass.SHA1_STRING)
    @SerializedName(ResponseClass.SHA1_STRING)
    var sha1: String,
    @ColumnInfo(name = ResponseClass.SHA256_STRING)
    @SerializedName(ResponseClass.SHA256_STRING)
    var sha256: String
)
