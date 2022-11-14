package by.zakdroid.candysellerapp.Main

import androidx.compose.foundation.layout.Column
import androidx.compose.material.Text
import androidx.compose.material.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun StatsScreen() {
Column() {
    TextButton(onClick = { /**/ }) {
        Text(text ="Выбор графика")
    }
}
}

@Preview
@Composable
fun StatsScreenPrew(){
    StatsScreen()
}