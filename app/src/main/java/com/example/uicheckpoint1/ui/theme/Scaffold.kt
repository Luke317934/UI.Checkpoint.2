package com.example.uicheckpoint1.ui.theme

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.sp

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ScaffoldLayout() {
    Scaffold(

        topBar = {
            TopAppBar(
                title = {
                    Text(text = "Top App Bar")
                },
                colors = TopAppBarDefaults.largeTopAppBarColors(
                    containerColor = MaterialTheme.colorScheme.primaryContainer
                )

            )
        },

        content = {values ->
            Column(Modifier.padding(values)) {

                Text(
                    text = "Content of 1st page",
                    //fontSize = 30.sp

                )
            }
        },

        bottomBar = {
            BottomAppBar(
                containerColor = MaterialTheme.colorScheme.primaryContainer,
                contentColor = MaterialTheme.colorScheme.primary,
            ) {
                Text(
                    //modifier = Modifier
                    //   .fillMaxWidth(),
                    //textAlign = TextAlign.Center,
                    text = "Bottom app bar",
                )
            }
        },

        floatingActionButton = {
            FloatingActionButton(onClick = {/* TODO -> Navigation */},
                //containerColor = MaterialTheme.colorScheme.tertiary
                //shape = MaterialTheme.shapes.small
                ){
                Icon(
                    Icons.Default.Favorite,
                    contentDescription = "Add",
                    //tint = MaterialTheme.colorScheme.onPrimary

                )
            }
        }
    )
}