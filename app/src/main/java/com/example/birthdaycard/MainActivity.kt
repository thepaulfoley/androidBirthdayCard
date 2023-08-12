package com.example.birthdaycard

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.birthdaycard.ui.theme.BirthdayCardTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BirthdayCardTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    MyMain("Android", from="Jesus")
                }
            }
        }
    }
}

@Composable
fun MyMain(name: String, modifier: Modifier = Modifier, from: String="Somebody special" ) {
    Text(
        text = "Happy Birthday, $name!\n From $from",
        modifier = modifier.padding(24.dp),
        fontSize = 24.sp,
        lineHeight = 48.sp
    )
    Text(
        text = "Other text element.",
        fontSize = 24.sp,
        lineHeight = 48.sp,

    )
}

@Preview(
    showBackground = true,
    showSystemUi = true,
    backgroundColor = 0xFF8BC34A
)
@Composable
fun MyMainPreview() {
    BirthdayCardTheme {
        MyMain("Paul", from = "Jesus")
    }
}