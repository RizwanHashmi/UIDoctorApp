package com.compose.doctor.composable_utils

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyHorizontalGrid
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.compose.doctor.R
import com.compose.doctor.model.DoctorDetails

@Composable
fun PopularDoctorsSection() {

    val doctorList = rememberSaveable {
        listOf(
            DoctorDetails("Dr. Tyler Smith", "Neurologist", "4.9", "$20", R.drawable.img_doctor_1),
            DoctorDetails("Dr. Tailor Some", "Neurologist", "4.9", "$20", R.drawable.img_doctor_2),
            DoctorDetails("Dr. Kunal Kristen", "Neurologist", "4.9", "$20", R.drawable.img_doctory_3),
            DoctorDetails("Dr. Oven Pop", "Neurologist", "4.9", "$20", R.drawable.img_doctor_1),
        )
    }


    Column(modifier = Modifier.padding(horizontal = 16.dp)) {

        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Text(
                text = "Popular Doctors",
                style = TextStyle(
                    color = Color(0xFF0f1333),
                    fontWeight = FontWeight.Bold,
                    fontSize = 18.sp,
                )
            )
            Text(
                text = "See All",
                style = TextStyle(
                    color = Color(0xFFa3b0d1),
                    fontWeight = FontWeight.Medium,
                    fontSize = 18.sp,
                )
            )
        }

        Spacer(modifier = Modifier.height(12.dp))

        LazyVerticalGrid(
            columns = GridCells.Fixed(2),
            modifier = Modifier.fillMaxSize(),
            horizontalArrangement = Arrangement.spacedBy(12.dp),
            verticalArrangement = Arrangement.spacedBy(12.dp),
            contentPadding = PaddingValues(0.dp)
        ) {
            items(doctorList) { doctor ->
                DoctorCard(
                    name = doctor.name,
                    specialty = doctor.specialty,
                    rating = doctor.rating,
                    fee = doctor.fee,
                    image = doctor.image
                )
            }
        }

    }
}
