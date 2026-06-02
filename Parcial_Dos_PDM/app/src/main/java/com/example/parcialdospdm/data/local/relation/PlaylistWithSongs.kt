package com.example.parcialdospdm.data.local.relation

import androidx.room.Embedded
import androidx.room.Junction
import androidx.room.Relation
import com.example.parcialdospdm.data.local.entity.PlaylistEntity
import com.example.parcialdospdm.data.local.entity.PlaylistSongCrossRef
import com.example.parcialdospdm.data.local.entity.SongEntity

data class PlaylistWithSongs(

    @Embedded
    val playlist: PlaylistEntity,

    @Relation(
        parentColumn = "id",
        entityColumn = "id",
        associateBy = Junction(PlaylistSongCrossRef::class)
    )
    val songs: List<SongEntity>
)