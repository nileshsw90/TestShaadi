package com.example.testshaadi.database

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.example.testshaadi.data.ResponseClass
import com.example.testshaadi.data.ResponseClass.Companion.STREET_TABLE_STRING
import com.google.gson.annotations.SerializedName

@Entity(tableName = STREET_TABLE_STRING)
data class Street(
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = ResponseClass.SRNO_STRING)
    var srNo: Int,
    @ColumnInfo(name = ResponseClass.NUMBER_STRING)
    @SerializedName(ResponseClass.NUMBER_STRING)
    var number: Int,
    @ColumnInfo(name = ResponseClass.NAME_STRING)
    @SerializedName(ResponseClass.NAME_STRING)
    var name: String
)
