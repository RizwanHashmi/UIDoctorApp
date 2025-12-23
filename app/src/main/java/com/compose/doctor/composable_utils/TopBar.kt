package com.compose.doctor.composable_utils

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.navigationBarsPadding
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.compose.doctor.HomeScreen
import com.compose.doctor.R
import com.compose.doctor.ui.theme.DoctorAppTheme

@Composable
fun TopBar() {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .background(Color.Transparent)

            .padding(16.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {

        TextField(
            value = "",
            onValueChange = {},
            placeholder = { Text("Search medicine") },
            leadingIcon = {
                Icon(
                    painter = painterResource(id = R.drawable.ic_search),
                    contentDescription = "Search",
                    tint = Color.Unspecified   // 🔥 keeps original icon color
                )
            },
            trailingIcon = {
                Icon(
                    painter = painterResource(id = R.drawable.ic_home_unselected),
                    contentDescription = "Home",
                    tint = Color.Unspecified   // 🔥 keeps original icon color

                )
            },
            shape = RoundedCornerShape(50.dp),
            colors = TextFieldDefaults.colors(
                focusedIndicatorColor = Color.Transparent,
                unfocusedIndicatorColor = Color.Transparent,
                disabledIndicatorColor = Color.Transparent,
                focusedContainerColor = Color.White,
                unfocusedContainerColor = Color.White
            ),
            modifier = Modifier.weight(1f)
        )


        Spacer(modifier = Modifier.width(12.dp))

        Icon(
            painter = painterResource(id = R.drawable.ic_drawer),
            contentDescription = "Menu",
            modifier = Modifier.size(28.dp),
            tint = Color.Unspecified   // 🔥 keeps original icon color
        )
    }
}

@Preview(showBackground = true)
@Composable
fun TopBarPreview() {
    DoctorAppTheme {
        TopBar()
    }
}