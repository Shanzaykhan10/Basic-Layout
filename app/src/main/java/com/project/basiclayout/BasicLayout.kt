package com.project.basiclayout

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.project.basiclayout.R

@Preview (showSystemUi = true,
    showBackground = true )
@Composable
fun UserProfileScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
        // Circular avatar
        Image(
            painter = painterResource(id = R.drawable.my_pic),
            contentDescription = "User avatar",
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .size(90.dp)
                .clip(CircleShape)

        )

        // User name
        Text(
            text = "Shanza Gulab",
            fontWeight = FontWeight.Bold,
            fontSize = 20.sp,
            modifier = Modifier.padding(top = 16.dp)
        )

        // Short bio
        Text(
            text = "A highly motivated Android developer eager to make a" +
                    "mark in the mobile app world.  Seeks to create innovative" +
                    " and user-friendly applications that address real-world issues.",
            textAlign = TextAlign.Justify,
            fontSize = 15.sp,
            modifier = Modifier.padding(top = 8.dp)
        )
    }
}