package com.example.formsample

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.ClickableText
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.formsample.pages.MessageCard
import com.example.formsample.ui.theme.Orange
import com.example.formsample.ui.theme.Orange2
import com.example.formsample.ui.theme.Purple700

@Composable
fun LoginPage(navController: NavController) {
   Box(modifier = Modifier.fillMaxSize()) {
        ClickableText(
            text = AnnotatedString("Signup Here"),
            modifier = Modifier
                .align(Alignment.BottomCenter)
                .padding(20.dp)
                .height(200.dp),

            onClick = { navController.navigate("signup") },
            style = TextStyle(
                fontSize = 20.sp,
                fontFamily = FontFamily.Default,
                textDecoration = TextDecoration.Underline,
                color = Purple700
            )
        )
   }

    Column(
        modifier = Modifier.padding(40.dp),
        verticalArrangement = Arrangement.SpaceAround,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        val username = remember {
            mutableStateOf(TextFieldValue())
        }
        val password = remember {
            mutableStateOf(TextFieldValue())
        }
        Spacer(modifier = Modifier.height(65.dp))

        Text(
            text = "Login",
            style = TextStyle(
                fontSize = 40.sp,
                fontFamily = FontFamily.Cursive),
            modifier = Modifier.padding(30.dp)
        )


        
        TextField(
            label = { Text(text = "Username") },
            value = username.value,
            onValueChange = { username.value = it }
        )

        Spacer(modifier = Modifier.height(15.dp))

        TextField(
            label = { Text(text = "Password") },
            value = password.value,
            onValueChange = { password.value = it },
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password)
        )

        Spacer(modifier = Modifier.height(15.dp))

        Box(modifier = Modifier.padding(40.dp, 0.dp, 40.dp, 0.dp)) {
            Button(
                onClick = {navController.navigate("chat") },
                shape = RoundedCornerShape(50.dp),
                modifier = Modifier
                    .fillMaxWidth()
                    .height(50.dp)
            ) {
               Text(text = "Login") 
            }
        }
        
        Spacer(modifier = Modifier.height(15.dp))

    }
}


