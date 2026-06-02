package com.example.parcialdospdm

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.navigation.compose.rememberNavController
import androidx.room.Room
import com.example.parcialdospdm.data.AppDatabase.AppDatabase
import com.example.parcialdospdm.ui.navigation.NavGraph
import com.example.parcialdospdm.ui.theme.ParcialDosPDMTheme

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val db = Room.databaseBuilder(
            applicationContext,
            AppDatabase::class.java,
            "music_database"
        ).build()

        val dao = db.musicDao()

        setContent {

            ParcialDosPDMTheme {

                val navController = rememberNavController()

                NavGraph(navController)
            }
        }
    }
}
