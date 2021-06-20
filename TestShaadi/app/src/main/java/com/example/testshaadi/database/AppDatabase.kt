package com.example.testshaadi.database

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters

@Database(
    entities = [Results::class, Dob::class, Id::class, Coordinates::class,
        Info::class, Location::class, Login::class, Name::class,
        Street::class, Timezone::class],
    version = 1,
    exportSchema = false
)
@TypeConverters(ConverterTypeClass::class)
abstract class AppDatabase : RoomDatabase() {

    abstract fun userDao(): UserDao

}