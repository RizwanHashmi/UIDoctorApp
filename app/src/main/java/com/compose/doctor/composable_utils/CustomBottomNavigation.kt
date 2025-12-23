package com.compose.doctor.composable_utils

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.compose.doctor.R
import com.compose.doctor.ui.theme.DoctorAppTheme

@Composable
fun CustomBottomNavigation() {

    val selectedIndex = 0 // change based on state

    Box(
        modifier = Modifier
            .fillMaxWidth()
            .background(Color.Transparent) // Add this
            .height(80.dp), // Set explicit height
        contentAlignment = Alignment.Center
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .height(64.dp)
                .padding(horizontal = 12.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceAround
        ) {

            BottomNavSelectedItem(
                icon = R.drawable.ic_home_selected,
                title = "Home",
                isSelected = selectedIndex == 0
            )

            BottomNavUnSelectedItem(R.drawable.ic_calendar)
            BottomNavUnSelectedItem(R.drawable.ic_heart)
            BottomNavUnSelectedItem(R.drawable.ic_chat)
            BottomNavUnSelectedItem(R.drawable.ic_user)
        }
    }
}


@Preview(showBackground = true)
@Composable
fun CustomBottomNavigationPreview() {
    DoctorAppTheme {
        CustomBottomNavigation()
    }
}
