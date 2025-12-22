package com.compose.doctor.composable_utils


import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.painterResource
import com.compose.doctor.R


@Composable
fun BottomNavigationBar() {
    NavigationBar {
        NavigationBarItem(
            selected = true,
            onClick = {},
            icon = { Icon(painterResource(R.drawable.ic_home_selected), null) }
        )
        NavigationBarItem(
            selected = false,
            onClick = {},
            icon = { Icon(painterResource(R.drawable.ic_heart), null) }
        )
        NavigationBarItem(
            selected = false,
            onClick = {},
            icon = { Icon(painterResource(R.drawable.ic_chat), null) }
        )
        NavigationBarItem(
            selected = false,
            onClick = {},
            icon = { Icon(painterResource(R.drawable.ic_user), null) }
        )
    }
}
