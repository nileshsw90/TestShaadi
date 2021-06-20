package com.example.testshaadi.data

import com.example.testshaadi.data.ResponseClass.Companion.INFO_STRING
import com.example.testshaadi.data.ResponseClass.Companion.RESULTS_STRING
import com.example.testshaadi.database.InfoEntity
import com.example.testshaadi.database.ResultsEntity
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
    @SerializedName(RESULTS_STRING) var results: ArrayList<ResultsEntity>,
    @SerializedName(INFO_STRING) var info: InfoEntity
)

/*data class Name(
    @SerializedName(TITLE_STRING) var title: String,
    @SerializedName(FIRST_STRING) var first: String,
    @SerializedName(LAST_STRING) var last: String
)

data class Street(
    @SerializedName(NUMBER_STRING) var number: Int,
    @SerializedName(NAME_STRING) var name: String
)

data class Coordinates(
    @SerializedName(LATITUDE_STRING) var latitude: String,
    @SerializedName(LONGITUDE_STRING) var longitude: String
)

data class Timezone(
    @SerializedName(OFFSET_STRING) var offset: String,
    @SerializedName(DESCRIPTION_STRING) var description: String
)

data class Location(
    @SerializedName(STREET_STRING) var street: Street,
    @SerializedName(CITY_STRING) var city: String,
    @SerializedName(STATE_STRING) var state: String,
    @SerializedName(COUNTRY_STRING) var country: String,
    @SerializedName(POSTCODE_STRING) var postcode: Int,
    @SerializedName(COORDINATES_STRING) var coordinates: Coordinates,
    @SerializedName(TIMEZONE_STRING) var timezone: Timezone
)

data class Login(
    @SerializedName(UUID_STRING) var uuid: String,
    @SerializedName(USERNAME_STRING) var username: String,
    @SerializedName(PASSWORD_STRING) var password: String,
    @SerializedName(SALT_STRING) var salt: String,
    @SerializedName(MD5_STRING) var md5: String,
    @SerializedName(SHA1_STRING) var sha1: String,
    @SerializedName(SHA256_STRING) var sha256: String
)

data class Dob(
    @SerializedName(DATE_STRING) var date: String,
    @SerializedName(AGE_STRING) var age: Int
)

data class Registered(
    @SerializedName(DATE_STRING) var date: String,
    @SerializedName(AGE_STRING) var age: Int
)

data class Id(
    @SerializedName(NAME_STRING) var name: String,
    @SerializedName(VALUE_STRING) var value: String
)

data class Picture(
    @SerializedName(LARGE_STRING) var large: String,
    @SerializedName(MEDIUM_STRING) var medium: String,
    @SerializedName(THUMBNAIL_STRING) var thumbnail: String
)

data class Results(
    @SerializedName(GENDER_STRING) var gender: String,
    @SerializedName(NAME_STRING) var name: Name,
    @SerializedName(LOCATION_STRING) var location: Location,
    @SerializedName(EMAIL_STRING) var email: String,
    @SerializedName(LOGIN_STRING) var login: Login,
    @SerializedName(DOB_STRING) var dob: Dob,
    @SerializedName(REGISTERED_STRING) var registered: Registered,
    @SerializedName(PHONE_STRING) var phone: String,
    @SerializedName(CELL_STRING) var cell: String,
    @SerializedName(ID_STRING) var id: Id,
    @SerializedName(PICTURE_STRING) var picture: Picture,
    @SerializedName(NAT_STRING) var nat: String
)

data class Info(
    @SerializedName(SEED_STRING) var seed: String,
    @SerializedName(RESULTS_STRING) var results: Int,
    @SerializedName(PAGE_STRING) var page: Int,
    @SerializedName(VERSION_STRING) var version: String
)*/
