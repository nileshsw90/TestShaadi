package com.example.testshaadi.database

import androidx.room.TypeConverter
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken


class ConverterTypeClass {

    @TypeConverter
    fun toName(name: String): NameEntity {
        val type = object : TypeToken<NameEntity>() {}.type
        return Gson().fromJson(name, type)
    }

    @TypeConverter
    fun fromName(name: NameEntity): String {
        return Gson().toJson(name).toString()
    }

    @TypeConverter
    fun toStreet(name: String): StreetEntity {
        val type = object : TypeToken<StreetEntity>() {}.type
        return Gson().fromJson(name, type)
    }

    @TypeConverter
    fun fromStreet(street: StreetEntity): String {
        return Gson().toJson(street).toString()
    }

    @TypeConverter
    fun toCoordinates(lng: String): CoordinatesEntity {
        val type = object : TypeToken<CoordinatesEntity>() {}.type
        return Gson().fromJson(lng, type)
    }

    @TypeConverter
    fun fromCoordinates(coordinates: CoordinatesEntity): String {
        return Gson().toJson(coordinates).toString()
    }

    @TypeConverter
    fun toTimezone(description: String): TimezoneEntity {
        val type = object : TypeToken<TimezoneEntity>() {}.type
        return Gson().fromJson(description, type)
    }

    @TypeConverter
    fun fromTimezone(timezone: TimezoneEntity): String {
        return Gson().toJson(timezone).toString()
    }

    @TypeConverter
    fun toLocation(street: String): LocationEntity {
        val type = object : TypeToken<LocationEntity>() {}.type
        return Gson().fromJson(street, type)
    }

    @TypeConverter
    fun fromLocation(location: LocationEntity): String {
        return Gson().toJson(location).toString()
    }

    @TypeConverter
    fun toLogin(uuid: String): LoginEntity {
        val type = object : TypeToken<LoginEntity>() {}.type
        return Gson().fromJson(uuid, type)
    }

    @TypeConverter
    fun fromLogin(login: LoginEntity): String {
        return Gson().toJson(login).toString()
    }

    @TypeConverter
    fun toDob(date: String): DobEntity {
        val type = object : TypeToken<DobEntity>() {}.type
        return Gson().fromJson(date, type)
    }

    @TypeConverter
    fun fromDob(dob: DobEntity): String {
        return Gson().toJson(dob).toString()
    }

    @TypeConverter
    fun toRegistered(date: String): RegisteredEntity {
        val type = object : TypeToken<RegisteredEntity>() {}.type
        return Gson().fromJson(date, type)
    }

    @TypeConverter
    fun fromRegistered(registered: RegisteredEntity): String {
        return Gson().toJson(registered).toString()
    }

    @TypeConverter
    fun toId(name: String): IdEntity {
        val type = object : TypeToken<IdEntity>() {}.type
        return Gson().fromJson(name, type)
    }

    @TypeConverter
    fun fromId(id: IdEntity): String {
        return Gson().toJson(id).toString()
    }

    @TypeConverter
    fun toPicture(large: String): PictureEntity {
        val type = object : TypeToken<PictureEntity>() {}.type
        return Gson().fromJson(large, type)
    }

    @TypeConverter
    fun fromPicture(picture: PictureEntity): String {
        return Gson().toJson(picture).toString()
    }

    @TypeConverter
    fun toInfo(seed: String): InfoEntity {
        val type = object : TypeToken<InfoEntity>() {}.type
        return Gson().fromJson(seed, type)
    }

    @TypeConverter
    fun fromInfo(info: InfoEntity): String {
        return Gson().toJson(info).toString()
    }

    @TypeConverter
    fun toResults(results: String): ArrayList<ResultsEntity> {
        val type = object : TypeToken<ArrayList<ResultsEntity>>() {}.type
        return Gson().fromJson(results, type)
    }

    @TypeConverter
    fun fromResults(results: ArrayList<ResultsEntity>): String {
        return Gson().toJson(results).toString()
    }

}