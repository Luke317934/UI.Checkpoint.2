package com.example.uicheckpoint1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import com.example.uicheckpoint1.ui.theme.ScaffoldLayout
import com.example.uicheckpoint1.ui.theme.UICheckpoint1Theme //import scaffold from other file

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            UICheckpoint1Theme {

                Surface(//not as important for this project
                    modifier = Modifier.fillMaxSize()
                ) {
                    ScaffoldLayout()
                }
            }
        }
    }
}

