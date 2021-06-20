package com.example.testshaadi.database

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters

@Database(
    entities = [ResultsEntity::class, DobEntity::class, IdEntity::class, CoordinatesEntity::class,
        InfoEntity::class, LocationEntity::class, LoginEntity::class, NameEntity::class,
        StreetEntity::class, TimezoneEntity::class],
    version = 1,
    exportSchema = false
)
@TypeConverters(ConverterTypeClass::class)
abstract class AppDatabase : RoomDatabase() {

    abstract fun userDao(): UserDao

}