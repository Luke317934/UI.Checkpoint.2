package com.example.uicheckpoint1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Button
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.ui.Modifier
import com.example.uicheckpoint1.ui.theme.ScaffoldLayout
import com.example.uicheckpoint1.ui.theme.UICheckpoint1Theme //import scaffold from other file

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {

            val exampleItems = List(12) { index -> "Eintrag ${index + 1}" }

            UICheckpoint1Theme {
                Surface(//not as important for this project
                    modifier = Modifier.fillMaxSize()
                ) {
                    ScaffoldLayout(screenHeading = "Test", content = {
                        LazyColumn {
                            items(exampleItems) { item ->
                                ListItem(item)
                            }
                        }
                    }, screenBottomBar = {
                        Button(onClick = { /*TODO*/ }) {
                            Text("Button")
                        }
                        Button(onClick = { /*TODO*/ }) {
                            Text("Button")
                        }
                    })
                }
            }
        }
    }
}

