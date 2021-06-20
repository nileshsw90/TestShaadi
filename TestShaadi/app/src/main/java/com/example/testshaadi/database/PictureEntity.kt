package com.example.testshaadi.database

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.example.testshaadi.data.ResponseClass
import com.google.gson.annotations.SerializedName

@Entity(tableName = "picture_table")
data class PictureEntity(
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = ResponseClass.SRNO_STRING)
    var srNo: Int,
    @ColumnInfo(name = ResponseClass.LARGE_STRING)
    @SerializedName(ResponseClass.LARGE_STRING)
    var large: String,
    @ColumnInfo(name = ResponseClass.MEDIUM_STRING)
    @SerializedName(ResponseClass.MEDIUM_STRING)
    var medium: String,
    @ColumnInfo(name = ResponseClass.THUMBNAIL_STRING)
    @SerializedName(ResponseClass.THUMBNAIL_STRING)
    var thumbnail: String
)
