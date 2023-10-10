package com.example.linkmorningalarm

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.example.linkmorningalarm.ui.theme.LinkMorningAlarmTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LinkMorningAlarmTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Home("Android")
                }
            }
        }
    }
}

@Composable
fun Home(name: String, modifier: Modifier = Modifier) {
    Column(
        Modifier
            .fillMaxWidth()
            .fillMaxHeight(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Row(){
            Text(
                text = "내 알람",
                modifier = modifier,
                fontSize = 20.sp
            )
            Text(
                text = "",
                modifier = modifier,
                fontSize = 20.sp
            )
        }
        LazyColumn{
            itemsIndexed(
                listOf(1,2,3)
            ){
                index, item -> AlarmCard()
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    LinkMorningAlarmTheme {
        Home("Android")
    }
}