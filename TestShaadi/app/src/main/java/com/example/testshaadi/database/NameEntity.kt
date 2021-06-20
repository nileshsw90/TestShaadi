package com.example.testshaadi.database

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.example.testshaadi.data.ResponseClass
import com.example.testshaadi.data.ResponseClass.Companion.FIRST_STRING
import com.example.testshaadi.data.ResponseClass.Companion.LAST_STRING
import com.example.testshaadi.data.ResponseClass.Companion.TITLE_STRING
import com.google.gson.annotations.SerializedName

@Entity(tableName = "name_table")
data class NameEntity(

    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = ResponseClass.SRNO_STRING)
    var srNo: Int,
    @ColumnInfo(name = TITLE_STRING)
    @SerializedName(TITLE_STRING) var title: String,
    @ColumnInfo(name = FIRST_STRING)
    @SerializedName(FIRST_STRING) var first: String,
    @ColumnInfo(name = LAST_STRING)
    @SerializedName(LAST_STRING) var last: String
)
