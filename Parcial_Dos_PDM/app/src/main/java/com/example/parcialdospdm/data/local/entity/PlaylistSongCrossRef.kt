package com.example.parcialdospdm.data.local.entity

import androidx.room.Entity

@Entity(primaryKeys = ["playlistId", "songId"])
data class PlaylistSongCrossRef(

    val playlistId: Int,

    val songId: Int
)