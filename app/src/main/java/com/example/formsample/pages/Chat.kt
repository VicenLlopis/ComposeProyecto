package com.example.formsample.pages

import android.app.Notification
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.example.formsample.R
import com.example.formsample.ui.theme.FormSampleTheme


@Composable
fun chat(author: String){
    MessageCard(author = author)
}




@Composable
fun MessageCard(author: String) {
    Text(text = author)


    Row {
        Image(
            painter = painterResource(R.drawable.foto_perfil),
            contentDescription = "Contact profile picture",
            modifier = Modifier
                // Set image size to 40 dp
                .size(40.dp)
                // Clip image to be shaped as a circle
                .clip(CircleShape)
                .border(1.5.dp, MaterialTheme.colors.secondary, CircleShape)
        )

        // Add a horizontal space between the image and the column
        Spacer(
            modifier = Modifier.width(8.dp)
        )

        Column {
            Text(text = author,
                color = MaterialTheme.colors.secondaryVariant,
                style = MaterialTheme.typography.subtitle2)

            Spacer(modifier = Modifier.height(4.dp))

            /*Surface(shape = MaterialTheme.shapes.medium, elevation = 1.dp) {
                Text(
                    text = author.body,
                    modifier = Modifier.padding(all = 4.dp),
                    style = MaterialTheme.typography.body2
                )
            }*/

        }
    }
}
