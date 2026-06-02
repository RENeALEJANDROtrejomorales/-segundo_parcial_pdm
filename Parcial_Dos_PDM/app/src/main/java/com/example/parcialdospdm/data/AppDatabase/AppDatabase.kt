package com.example.parcialdospdm.data.AppDatabase

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.parcialdospdm.data.dao.MusicDao
import com.example.parcialdospdm.data.local.entity.GenreEntity
import com.example.parcialdospdm.data.local.entity.PlaylistEntity
import com.example.parcialdospdm.data.local.entity.PlaylistSongCrossRef
import com.example.parcialdospdm.data.local.entity.SongEntity

@Database(
    entities = [
        SongEntity::class,
        GenreEntity::class,
        PlaylistEntity::class,
        PlaylistSongCrossRef::class
    ],
    version = 1
)
abstract class AppDatabase : RoomDatabase() {

    abstract fun musicDao(): MusicDao
}