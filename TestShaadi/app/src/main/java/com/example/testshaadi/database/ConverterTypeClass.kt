package com.example.testshaadi.database

import androidx.room.TypeConverter
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken


class ConverterTypeClass {

    @TypeConverter
    fun toName(name: String): Name {
        val type = object : TypeToken<Name>() {}.type
        return Gson().fromJson(name, type)
    }

    @TypeConverter
    fun fromName(name: Name): String {
        return Gson().toJson(name).toString()
    }

    @TypeConverter
    fun toStreet(name: String): Street {
        val type = object : TypeToken<Street>() {}.type
        return Gson().fromJson(name, type)
    }

    @TypeConverter
    fun fromStreet(street: Street): String {
        return Gson().toJson(street).toString()
    }

    @TypeConverter
    fun toCoordinates(lng: String): Coordinates {
        val type = object : TypeToken<Coordinates>() {}.type
        return Gson().fromJson(lng, type)
    }

    @TypeConverter
    fun fromCoordinates(coordinates: Coordinates): String {
        return Gson().toJson(coordinates).toString()
    }

    @TypeConverter
    fun toTimezone(description: String): Timezone {
        val type = object : TypeToken<Timezone>() {}.type
        return Gson().fromJson(description, type)
    }

    @TypeConverter
    fun fromTimezone(timezone: Timezone): String {
        return Gson().toJson(timezone).toString()
    }

    @TypeConverter
    fun toLocation(street: String): Location {
        val type = object : TypeToken<Location>() {}.type
        return Gson().fromJson(street, type)
    }

    @TypeConverter
    fun fromLocation(location: Location): String {
        return Gson().toJson(location).toString()
    }

    @TypeConverter
    fun toLogin(uuid: String): Login {
        val type = object : TypeToken<Login>() {}.type
        return Gson().fromJson(uuid, type)
    }

    @TypeConverter
    fun fromLogin(login: Login): String {
        return Gson().toJson(login).toString()
    }

    @TypeConverter
    fun toDob(date: String): Dob {
        val type = object : TypeToken<Dob>() {}.type
        return Gson().fromJson(date, type)
    }

    @TypeConverter
    fun fromDob(dob: Dob): String {
        return Gson().toJson(dob).toString()
    }

    @TypeConverter
    fun toRegistered(date: String): Registered {
        val type = object : TypeToken<Registered>() {}.type
        return Gson().fromJson(date, type)
    }

    @TypeConverter
    fun fromRegistered(registered: Registered): String {
        return Gson().toJson(registered).toString()
    }

    @TypeConverter
    fun toId(name: String): Id {
        val type = object : TypeToken<Id>() {}.type
        return Gson().fromJson(name, type)
    }

    @TypeConverter
    fun fromId(id: Id): String {
        return Gson().toJson(id).toString()
    }

    @TypeConverter
    fun toPicture(large: String): Picture {
        val type = object : TypeToken<Picture>() {}.type
        return Gson().fromJson(large, type)
    }

    @TypeConverter
    fun fromPicture(picture: Picture): String {
        return Gson().toJson(picture).toString()
    }

    @TypeConverter
    fun toInfo(seed: String): Info {
        val type = object : TypeToken<Info>() {}.type
        return Gson().fromJson(seed, type)
    }

    @TypeConverter
    fun fromInfo(info: Info): String {
        return Gson().toJson(info).toString()
    }

    @TypeConverter
    fun toResults(results: String): ArrayList<Results> {
        val type = object : TypeToken<ArrayList<Results>>() {}.type
        return Gson().fromJson(results, type)
    }

    @TypeConverter
    fun fromResults(results: ArrayList<Results>): String {
        return Gson().toJson(results).toString()
    }

}