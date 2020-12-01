package com.example.jol.data

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.jol.data.dao.AvtoDao
import com.example.jol.data.model.Avto

@Database(entities = [Avto::class], version = 1)
abstract class AvtoDatabase: RoomDatabase() {
    companion object{
        private lateinit var INSTANCE: AvtoDatabase

        fun getInstance(context: Context): AvtoDatabase =
            Room.databaseBuilder(
                context,
                AvtoDatabase::class.java,
                "avto.db"
            )
                .createFromAsset("avto.db")
                .build()
    }

    abstract fun dao(): AvtoDao
}