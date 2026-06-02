package com.example.parcialdospdm.data.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Transaction
import com.example.parcialdospdm.data.local.entity.GenreEntity
import com.example.parcialdospdm.data.local.entity.PlaylistEntity
import com.example.parcialdospdm.data.local.entity.PlaylistSongCrossRef
import com.example.parcialdospdm.data.local.entity.SongEntity
import com.example.parcialdospdm.data.local.relation.PlaylistWithSongs

@Dao
interface MusicDao {

    @Insert
    suspend fun insertSong(song: SongEntity)

    @Insert
    suspend fun insertGenre(genre: GenreEntity)

    @Insert
    suspend fun insertPlaylist(playlist: PlaylistEntity)

    @Insert
    suspend fun insertPlaylistSongCrossRef(crossRef: PlaylistSongCrossRef)

    @Query("SELECT * FROM songs")
    suspend fun getAllSongs(): List<SongEntity>

    @Query("SELECT * FROM genres")
    suspend fun getAllGenres(): List<GenreEntity>

    @Query("SELECT * FROM playlists")
    suspend fun getAllPlaylists(): List<PlaylistEntity>

    @Transaction
    @Query("SELECT * FROM playlists")
    suspend fun getPlaylistsWithSongs(): List<PlaylistWithSongs>
}