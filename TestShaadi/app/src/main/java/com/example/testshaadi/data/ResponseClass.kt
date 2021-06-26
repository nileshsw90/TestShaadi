package com.example.testshaadi.data

import com.example.testshaadi.database.Info
import com.example.testshaadi.database.Results
import com.google.gson.annotations.SerializedName

class ResponseClass {

    companion object {
        //DB name
        const val DATABASE_NAME: String = "RoomBook"

        //Entity class column names
        const val RESULTS_STRING: String = "results"
        const val INFO_STRING: String = "info"
        const val TITLE_STRING: String = "title"
        const val FIRST_STRING: String = "first"
        const val LAST_STRING: String = "last"
        const val NUMBER_STRING: String = "number"
        const val NAME_STRING: String = "name"
        const val LATITUDE_STRING: String = "latitude"
        const val LONGITUDE_STRING: String = "longitude"
        const val OFFSET_STRING: String = "offset"
        const val DESCRIPTION_STRING: String = "description"
        const val STREET_STRING: String = "street"
        const val CITY_STRING: String = "city"
        const val STATE_STRING: String = "state"
        const val COUNTRY_STRING: String = "country"
        const val POSTCODE_STRING: String = "postcode"
        const val COORDINATES_STRING: String = "coordinates"
        const val TIMEZONE_STRING: String = "timezone"
        const val UUID_STRING: String = "uuid"
        const val USERNAME_STRING: String = "username"
        const val PASSWORD_STRING: String = "password"
        const val SALT_STRING: String = "salt"
        const val MD5_STRING: String = "md5"
        const val SHA1_STRING: String = "sha1"
        const val SHA256_STRING: String = "sha256"
        const val DATE_STRING: String = "date"
        const val AGE_STRING: String = "age"
        const val VALUE_STRING: String = "value"
        const val LARGE_STRING: String = "large"
        const val MEDIUM_STRING: String = "medium"
        const val THUMBNAIL_STRING: String = "thumbnail"
        const val GENDER_STRING: String = "gender"
        const val LOCATION_STRING: String = "location"
        const val LOGIN_STRING: String = "login"
        const val EMAIL_STRING: String = "email"
        const val DOB_STRING: String = "dob"
        const val REGISTERED_STRING: String = "registered"
        const val PHONE_STRING: String = "phone"
        const val CELL_STRING: String = "cell"
        const val ID_STRING: String = "id"
        const val PICTURE_STRING: String = "picture"
        const val NAT_STRING: String = "nat"
        const val SEED_STRING: String = "seed"
        const val PAGE_STRING: String = "page"
        const val VERSION_STRING: String = "version"
        const val SRNO_STRING: String = "SrNo"

        // DB table names constants
        const val COORDINATES_TABLE_STRING: String = "coordinates_table"
        const val DOB_TABLE_STRING: String = "dob_table"
        const val ID_TABLE_STRING: String = "id_table"
        const val INFO_TABLE_STRING: String = "info_table"
        const val LOCATION_TABLE_STRING: String = "location_table"
        const val LOGIN_TABLE_STRING: String = "login_table"
        const val NAME_TABLE_STRING: String = "name_table"
        const val PICTURE_TABLE_STRING: String = "picture_table"
        const val REGISTERED_TABLE_STRING: String = "registered_table"
        const val RESULTS_TABLE_STRING: String = "results_table"
        const val STREET_TABLE_STRING: String = "street_table"
        const val TIMEZONE_TABLE_STRING: String = "timezone_table"
    }

}

data class ResponseData(
    @SerializedName(ResponseClass.RESULTS_STRING) var results: List<Results>,
    @SerializedName(ResponseClass.INFO_STRING) var info: Info
)