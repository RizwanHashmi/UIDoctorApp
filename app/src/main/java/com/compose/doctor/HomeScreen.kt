package com.compose.doctor

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.compose.doctor.composable_utils.BottomNavigationBar
import com.compose.doctor.composable_utils.OfferCard
import com.compose.doctor.composable_utils.PopularDoctorsSection
import com.compose.doctor.composable_utils.TopBar

@Composable
fun HomeScreen() {
    Scaffold(
        bottomBar = { BottomNavigationBar() }
    ) { padding ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(padding)
                .background(Color(0xFFf2f5ff))
        ) {
            TopBar()
            Spacer(modifier = Modifier.height(16.dp))
            OfferCard()
            Spacer(modifier = Modifier.height(20.dp))
            PopularDoctorsSection()
        }
    }
}
