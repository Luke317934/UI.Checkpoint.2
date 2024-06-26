package com.example.uicheckpoint1

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Checkbox
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp



@Preview(showBackground = true)
@Composable
fun ListItemPreview(){
    ListItem("Eintrag 1")
}

@Composable
fun ListItem(title: String) {
    val checkBox = false
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .background(
                MaterialTheme.colorScheme.background, shape = RoundedCornerShape(16.dp)
            )
            .padding(16.dp)
            .clickable { /*Todoo*/ },
        Arrangement.SpaceBetween, Alignment.CenterVertically
    ) {
        Text(title)
        Checkbox(checked = checkBox, onCheckedChange = { isChecked -> /*TOdo*/ })
    }
}