package fr.isen.morelli.androidsmartdevice.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import fr.isen.morelli.androidsmartdevice.R


@Composable
fun MainScreen(navController: NavController) {
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Image(
            painter = painterResource(id = R.drawable.logo),
            contentDescription = "App Icon",
            modifier = Modifier.size(100.dp)
        )

        Text(
            text = "Bienvenue dans l'application de scan BLE",
            fontSize = 20.sp,
            textAlign = TextAlign.Center,
            modifier = Modifier.padding(16.dp)
        )

        Button(
            onClick = { navController.navigate("scan") },
            modifier = Modifier.padding(16.dp)
        ) {
            Text(text = "Scanner les appareils BLE")
        }
    }
}