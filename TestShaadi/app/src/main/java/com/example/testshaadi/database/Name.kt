package com.example.testshaadi.database

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.example.testshaadi.data.ResponseClass
import com.example.testshaadi.data.ResponseClass.Companion.NAME_TABLE_STRING
import com.google.gson.annotations.SerializedName

@Entity(tableName = NAME_TABLE_STRING)
data class Name(
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = ResponseClass.SRNO_STRING)
    var srNo: Int,
    @ColumnInfo(name = ResponseClass.TITLE_STRING)
    @SerializedName(ResponseClass.TITLE_STRING)
    var title: String,
    @ColumnInfo(name = ResponseClass.FIRST_STRING)
    @SerializedName(ResponseClass.FIRST_STRING)
    var first: String,
    @ColumnInfo(name = ResponseClass.LAST_STRING)
    @SerializedName(ResponseClass.LAST_STRING)
    var last: String
)
