package com.example.jol.data.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity(tableName = "shtraflar")
data class Avto (
    @PrimaryKey
    val id: Int,

    @ColumnInfo(name="text")
    val text: String,
    )