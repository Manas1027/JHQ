package com.example.jol.data.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity(tableName = "legkovoy")
data class Avto (
    @PrimaryKey
    val id: Int,

    @ColumnInfo(name="name")
    val name: String,

    @ColumnInfo(name="cena")
    val cena: Int,

    @ColumnInfo(name="at_kushi")
    val atKushi: Int
    )