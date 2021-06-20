package com.example.testshaadi.data

import com.example.testshaadi.database.Info
import com.example.testshaadi.database.Results
import com.google.gson.annotations.SerializedName

class ResponseClass {

    companion object {
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
    }

}

data class ResponseData(
    @SerializedName(ResponseClass.RESULTS_STRING) var results: List<Results>,
    @SerializedName(ResponseClass.INFO_STRING) var info: Info
)

/*@Entity(tableName = "name_table")
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

@Entity(tableName = "street_table")
data class Street(
    @PrimaryKey
    @ColumnInfo(name = ResponseClass.NUMBER_STRING)
    @SerializedName(ResponseClass.NUMBER_STRING)
    var number: Int,
    @ColumnInfo(name = ResponseClass.NAME_STRING)
    @SerializedName(ResponseClass.NAME_STRING)
    var name: String
)

@Entity(tableName = "coordinates_table")
data class Coordinates(
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = ResponseClass.SRNO_STRING)
    var srNo: Int,
    @ColumnInfo(name = ResponseClass.LATITUDE_STRING)
    @SerializedName(ResponseClass.LATITUDE_STRING)
    var latitude: String,
    @ColumnInfo(name = ResponseClass.LONGITUDE_STRING)
    @SerializedName(ResponseClass.LONGITUDE_STRING)
    var longitude: String
)

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

@Entity(tableName = "location_table")
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
    var postcode: Int,
    @ColumnInfo(name = ResponseClass.COORDINATES_STRING)
    @SerializedName(ResponseClass.COORDINATES_STRING)
    var coordinates: Coordinates,
    @ColumnInfo(name = ResponseClass.TIMEZONE_STRING)
    @SerializedName(ResponseClass.TIMEZONE_STRING)
    var timezone: Timezone
)

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

@Entity(tableName = "dob_table")
data class Dob(
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = ResponseClass.SRNO_STRING)
    var srNo: Int,
    @ColumnInfo(name = ResponseClass.DATE_STRING)
    @SerializedName(ResponseClass.DATE_STRING)
    var date: String,
    @ColumnInfo(name = ResponseClass.AGE_STRING)
    @SerializedName(ResponseClass.AGE_STRING)
    var age: Int
)

@Entity(tableName = "registered_table")
data class Registered(
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = ResponseClass.SRNO_STRING)
    var srNo: Int,
    @ColumnInfo(name = ResponseClass.DATE_STRING)
    @SerializedName(ResponseClass.DATE_STRING)
    var date: String,
    @ColumnInfo(name = ResponseClass.AGE_STRING)
    @SerializedName(ResponseClass.AGE_STRING)
    var age: Int
)

@Entity(tableName = "id_table")
data class Id(
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

@Entity(tableName = "picture_table")
data class Picture(
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

@Entity(tableName = "results_table")
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

@Entity(tableName = "info_table")
data class Info(
    @PrimaryKey
    @ColumnInfo(name = ResponseClass.SEED_STRING)
    @SerializedName(ResponseClass.SEED_STRING)
    var seed: String,
    @ColumnInfo(name = ResponseClass.RESULTS_STRING)
    @SerializedName(ResponseClass.RESULTS_STRING)
    var results: Int,
    @ColumnInfo(name = ResponseClass.PAGE_STRING)
    @SerializedName(ResponseClass.PAGE_STRING)
    var page: Int,
    @ColumnInfo(name = ResponseClass.VERSION_STRING)
    @SerializedName(ResponseClass.VERSION_STRING)
    var version: String
)*/
