package com.example.testshaadi.database

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.example.testshaadi.data.ResponseClass
import com.google.gson.annotations.SerializedName

@Entity(tableName = "id_table")
data class IdEntity(
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = ResponseClass.SRNO_STRING)
    var srNo: Int,
    @ColumnInfo(name = ResponseClass.NAME_STRING)
    @SerializedName(ResponseClass.NAME_STRING)
    var name: String,
    @ColumnInfo(name = ResponseClass.VALUE_STRING)
    @SerializedName(ResponseClass.VALUE_STRING)
    var value: String
)
