package com.example.parcialdospdm.repository

import com.example.parcialdospdm.data.dao.MusicDao
import com.example.parcialdospdm.data.local.entity.GenreEntity
import com.example.parcialdospdm.data.local.entity.PlaylistEntity
import com.example.parcialdospdm.data.local.entity.PlaylistSongCrossRef
import com.example.parcialdospdm.data.local.entity.SongEntity

class MusicRepository(
    private val dao: MusicDao
) {

    suspend fun insertSong(song: SongEntity) {
        dao.insertSong(song)
    }

    suspend fun insertGenre(genre: GenreEntity) {
        dao.insertGenre(genre)
    }

    suspend fun insertPlaylist(playlist: PlaylistEntity) {
        dao.insertPlaylist(playlist)
    }

    suspend fun insertPlaylistSong(crossRef: PlaylistSongCrossRef) {
        dao.insertPlaylistSongCrossRef(crossRef)
    }

    suspend fun getSongs() = dao.getAllSongs()

    suspend fun getGenres() = dao.getAllGenres()

    suspend fun getPlaylists() = dao.getAllPlaylists()

    suspend fun getPlaylistsWithSongs() = dao.getPlaylistsWithSongs()
}