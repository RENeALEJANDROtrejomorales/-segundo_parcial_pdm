package com.example.parcialdospdm.ui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import coil.compose.AsyncImage

data class FakeSong(
    val title: String,
    val artist: String,
    val image: String
)

@Composable
fun SongScreen(
    navController: NavHostController
) {

    val songs = listOf(

        FakeSong(
            "Blinding Lights",
            "The Weeknd",
            "https://i.scdn.co/image/ab67616d0000b2730d3b1c5d5c4c6a5f1d1a2c3"
        ),

        FakeSong(
            "Shape of You",
            "Ed Sheeran",
            "https://i.scdn.co/image/ab67616d0000b273ba5db46f4b838ef6027e6f96"
        ),

        FakeSong(
            "Levitating",
            "Dua Lipa",
            "https://i.scdn.co/image/ab67616d0000b273d4daf28d55fe4197ede848be"
        )
    )

    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),

        verticalArrangement = Arrangement.spacedBy(16.dp)
    ) {

        items(songs) { song ->

            Card(
                modifier = Modifier.fillMaxWidth()
            ) {

                Column(
                    modifier = Modifier.padding(16.dp)
                ) {

                    AsyncImage(
                        model = song.image,
                        contentDescription = null,
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(200.dp)
                    )

                    Text(song.title)

                    Text(song.artist)
                }
            }
        }
    }
}