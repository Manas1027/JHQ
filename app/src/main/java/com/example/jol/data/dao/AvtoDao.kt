package com.example.jol.data.dao

import androidx.room.Dao
import androidx.room.Query
import com.example.jol.data.model.Avto

@Dao
interface AvtoDao {
    @Query("SELECT * FROM legkovoy")
    fun getAvto(): List<Avto>
}