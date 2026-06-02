package com.example.parcialdospdm.data.local.entity

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "songs")
data class SongEntity(

    @PrimaryKey(autoGenerate = true)
    val id: Int = 0,

    val title: String,

    val artist: String,

    val album: String,

    val coverUrl: String,

    val genre: String
)