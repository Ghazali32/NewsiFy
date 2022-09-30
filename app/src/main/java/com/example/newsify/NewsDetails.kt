package com.example.newsify

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.rememberAsyncImagePainter

@Composable
fun NewsDetails(news : News?)
{
    Column(modifier = Modifier.fillMaxSize()) {
        Row() {
            Image(
                painter = rememberAsyncImagePainter(model = news?.urlToImage),
                contentDescription = "news Image Details",
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(10.dp)
                    .clip(shape = RoundedCornerShape(15.dp))
            )
        }
        Text(text = news?.title?:"Default title", style = TextStyle(
            color = Color.Black , fontSize = 16.sp ,
            fontFamily = FontFamily.Monospace , fontWeight = FontWeight.Bold , background = Color.Transparent
        ))

    }

}