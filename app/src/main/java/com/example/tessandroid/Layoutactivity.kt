package com.example.tessandroid

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material.icons.filled.Share
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.tessandroid.ui.theme.TessAndroidTheme

class Layoutactivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
          Layout()
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Layout(){
   Column (modifier = Modifier.fillMaxSize()){

       val mContext = LocalContext.current

       //TopAppBar
      TopAppBar(
          title = { Text(text = "HomeScreen", color = Color.White) },
          colors = TopAppBarDefaults.mediumTopAppBarColors(Color.Red),
          navigationIcon = {
              IconButton(onClick = {
                  mContext.startActivity(Intent(mContext,Layoutactivity::class.java))
              }) {
                  Icon(imageVector = Icons.Default.ArrowBack ,
                      contentDescription = "ArrowBack",
                      tint = Color.White)
              }
          },
          actions = {
              IconButton(onClick = { /*TODO*/ }) {
                  Icon(imageVector = Icons.Default.Share ,
                      contentDescription = "Share",
                      tint = Color.White)
              }

              IconButton(onClick = { /*TODO*/ }) {
                  Icon(imageVector = Icons.Default.Settings,
                      contentDescription = "Settings",
                      tint = Color.White)
              }
          }
      )
       //End of topappbar

       Text(
           text = "Destinations",
           fontSize = 30.sp,
           modifier = Modifier.fillMaxWidth(),
           textAlign = TextAlign.Center,
           fontFamily = FontFamily.Cursive
       )
       //First Row
       Row {
           Image(painter = painterResource(id = R.drawable.des1),
               contentDescription = "des1",
               modifier = Modifier.size(width = 200.dp, height = 150.dp)
           )
           
           Spacer(modifier = Modifier.width(15.dp))
           
           Column {
               Text(text = "des1", fontWeight = FontWeight.Bold)
               Text(text = " The des1 is characterized by many famous skyscrapers. The Chrysler Building, the Rockefeller Center - these views are so breathtaking ")

           }
       }

       Spacer(modifier = Modifier.width(15.dp))

       //End Row
       Row {
           Image(painter = painterResource(id = R.drawable.dest2),
               contentDescription = "dest2",
               modifier = Modifier.size(width = 200.dp, height = 150.dp)
           )

           Spacer(modifier = Modifier.width(15.dp))

           Column {
               Text(text = "dest2", fontWeight = FontWeight.Bold)
               Text(text = "The dest2 is characterized by many famous skyscrapers. The Chrysler Building, the Rockefeller Center - these views are so breathtaking ")

           }
       }

       Spacer(modifier = Modifier.width(15.dp))

       Box(modifier = Modifier.fillMaxWidth(),
           contentAlignment = Alignment.Center){
           Button(onClick = {
               mContext.startActivity(Intent(mContext,intentActivity::class.java))
           },
           ) {
               Text(text = "Sign in with our account")
           }
       }

       //End Row
       Row {
           Image(painter = painterResource(id = R.drawable.dest4),
               contentDescription = "dest4",
               modifier = Modifier.size(width = 200.dp, height = 150.dp)
           )

           Spacer(modifier = Modifier.width(15.dp))

           Column {
               Text(text = "dest4", fontWeight = FontWeight.Bold)
               Text(text = "The dest4 is characterized by many famous skyscrapers. The Chrysler Building, the Rockefeller Center - these views are so breathtaking ")

           }
       }



   }
}

@Preview(showBackground = true)
@Composable
fun LayoutPreview(){
    Layout()
}