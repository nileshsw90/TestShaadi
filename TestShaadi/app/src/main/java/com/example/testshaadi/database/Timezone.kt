package com.example.testshaadi.database

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.example.testshaadi.data.ResponseClass
import com.google.gson.annotations.SerializedName

@Entity(tableName = "timezone_table")
data class Timezone(
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = ResponseClass.SRNO_STRING)
    var srNo: Int,
    @ColumnInfo(name = ResponseClass.OFFSET_STRING)
    @SerializedName(ResponseClass.OFFSET_STRING)
    var offset: String,
    @ColumnInfo(name = ResponseClass.DESCRIPTION_STRING)
    @SerializedName(ResponseClass.DESCRIPTION_STRING)
    var description: String
)
