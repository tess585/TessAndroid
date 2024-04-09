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
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.FavoriteBorder
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material.icons.filled.Share
import androidx.compose.material.icons.filled.Star
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.net.toUri
import com.example.tessandroid.ui.theme.TessAndroidTheme

class ExploreActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Explore()
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Explore(){
    Column (
        modifier = Modifier.fillMaxSize())
    {

        val mContext = LocalContext.current

        //TopAppBar
        TopAppBar(
            title = { Text(text = "Cities", color = Color.Black) },
            colors = TopAppBarDefaults.mediumTopAppBarColors(Color.White),
            navigationIcon = {
                IconButton(onClick = {
                    mContext.startActivity(Intent(mContext,Layoutactivity::class.java))
                }) {
                    Icon(imageVector = Icons.Default.Menu ,
                        contentDescription = "Menu",
                        tint = Color.Black)
                }

            },
            actions = {
                IconButton(onClick = { /*TODO*/ }) {
                    Icon(imageVector = Icons.Default.Notifications ,
                        contentDescription = "Notification",
                        tint = Color.Black)
                }

                IconButton(onClick = { /*TODO*/ }) {
                    Icon(imageVector = Icons.Default.Share,
                        contentDescription = "Share",
                        tint = Color.Black)
                }
                IconButton(onClick = { /*TODO*/ }) {
                    Icon(imageVector = Icons.Default.Search,
                        contentDescription = "Search",
                        tint = Color.Black)
                }

            }

        )
        //End of topappbar

        Box(modifier = Modifier.fillMaxWidth(),
            contentAlignment = Alignment.Center,){
            Button(onClick = { mContext.startActivity(Intent(mContext, Layoutactivity::class.java))
            },
            ) {
                Text(text = "EXPLORE MORE")
            }
        }

        Column (modifier = Modifier.verticalScroll(rememberScrollState())){

            Text(text = "Tickets",
                fontSize = 40.sp,
                fontFamily = FontFamily.Cursive,
                fontWeight = FontWeight.ExtraBold ,
                modifier = Modifier.padding(start = 20.dp))

            Spacer(modifier = Modifier.height(10.dp))

            //Row1

           Row (
               modifier = Modifier.padding(start = 25.dp)
           ){
               //Column1
               Column {
                   Card (modifier = Modifier
                       .height(100.dp)
                       .width(160.dp)
                   ){
                       Box (modifier = Modifier.fillMaxWidth(),
                           contentAlignment = Alignment.Center
                       ){
                           Image(painter = painterResource(id = R.drawable.des1),
                               contentDescription ="des1",
                               modifier = Modifier.fillMaxSize(),
                               contentScale = ContentScale.FillBounds)

                          Image(imageVector = Icons.Default.FavoriteBorder,
                              contentDescription = "favoriteBorder",
                              modifier = Modifier
                                  .align(Alignment.TopEnd)
                                  .padding(15.dp))
                       }
                   }
                   Spacer(modifier = Modifier.height(10.dp))

                   Text(text = "Colosseum",
                       fontSize = 20.sp,
                       fontFamily = FontFamily.Serif,
                       fontWeight = FontWeight.ExtraBold ,
                   )
                   Spacer(modifier = Modifier.height(2.dp))
                   Row {
                       Icon(imageVector = Icons.Default.Star, contentDescription ="star", tint = Color.Blue)
                       Icon(imageVector = Icons.Default.Star, contentDescription ="star", tint = Color.Red)
                       Icon(imageVector = Icons.Default.Star, contentDescription ="star", tint = Color.Blue)
                       Icon(imageVector = Icons.Default.Star, contentDescription ="star", tint = Color.Red)
                   }
                   Spacer(modifier = Modifier.height(2.dp))
                   Text(text = "443 reviews",
                       fontSize = 15.sp,
                       fontFamily = FontFamily.Serif,)

                   Spacer(modifier = Modifier.height(2.dp))
                   Text(text = "From Ksh.3000",
                       fontSize = 20.sp,
                       fontFamily = FontFamily.Serif,
                       fontWeight = FontWeight.ExtraBold ,
                       color = Color.Blue)

                   Spacer(modifier = Modifier.height(2.dp))
                   Row {
                       OutlinedButton(onClick = {
                           val callIntent=Intent(Intent.ACTION_DIAL)
                           callIntent.data="tel:0720245837".toUri()
                           mContext.startActivity(callIntent)
                       }) {
                           Text(text = "Call")
                       }
                       OutlinedButton(onClick = {
                           val shareIntent = Intent(Intent.ACTION_SEND)
                           shareIntent.type = "text/plain"
                           shareIntent.putExtra(Intent.EXTRA_EMAIL, arrayOf("akinyiglory2@gmail.com"))
                           shareIntent.putExtra(Intent.EXTRA_SUBJECT, "subject")
                           shareIntent.putExtra(Intent.EXTRA_TEXT, "Hello, this is the email body")
                           mContext.startActivity(shareIntent)
                       }) {
                           Text(text = "email")
                       }
                   }

               }
               //End of column

               Spacer(modifier = Modifier.width(20.dp))

               //Column2
               Column {
                   Card (modifier = Modifier
                       .height(100.dp)
                       .width(160.dp)
                   ){
                       Box (modifier = Modifier.fillMaxWidth(),
                           contentAlignment = Alignment.Center
                       ){
                           Image(painter = painterResource(id = R.drawable.dest2),
                               contentDescription ="dest2",
                               modifier = Modifier.fillMaxSize(),
                               contentScale = ContentScale.FillBounds)

                           Image(
                               imageVector =Icons.Default.FavoriteBorder ,
                               contentDescription = "favoriteBorder",
                               modifier = Modifier
                                   .align(Alignment.TopEnd)
                                   .padding(15.dp))
                       }
                   }
                   Spacer(modifier = Modifier.height(10.dp))

                   Text(text = "New York",
                       fontSize = 20.sp,
                       fontFamily = FontFamily.Serif,
                       fontWeight = FontWeight.ExtraBold ,
                   )
                   Spacer(modifier = Modifier.height(2.dp))
                   Row {
                       Icon(imageVector = Icons.Default.Star, contentDescription ="star", tint = Color.Blue)
                       Icon(imageVector = Icons.Default.Star, contentDescription ="star", tint = Color.Red)
                       Icon(imageVector = Icons.Default.Star, contentDescription ="star", tint = Color.Blue)
                       Icon(imageVector = Icons.Default.Star, contentDescription ="star", tint = Color.Red)
                   }
                   Spacer(modifier = Modifier.height(2.dp))
                   Text(text = "22",
                       fontSize = 15.sp,
                       fontFamily = FontFamily.Serif,)

                   Spacer(modifier = Modifier.height(2.dp))
                   Text(text = "From Ksh.2000",
                       fontSize = 20.sp,
                       fontFamily = FontFamily.Serif,
                       fontWeight = FontWeight.ExtraBold ,
                       color = Color.Blue)

                   Spacer(modifier = Modifier.height(2.dp))
                   Row {
                       OutlinedButton(onClick = {
                           val callIntent=Intent(Intent.ACTION_DIAL)
                           callIntent.data="tel:0720245837".toUri()
                           mContext.startActivity(callIntent)
                       }) {
                           Text(text = "Call")
                       }
                       OutlinedButton(onClick = {
                           val shareIntent = Intent(Intent.ACTION_SEND)
                           shareIntent.type = "text/plain"
                           shareIntent.putExtra(Intent.EXTRA_EMAIL, arrayOf("akinyiglory2@gmail.com"))
                           shareIntent.putExtra(Intent.EXTRA_SUBJECT, "subject")
                           shareIntent.putExtra(Intent.EXTRA_TEXT, "Hello, this is the email body")
                           mContext.startActivity(shareIntent)
                       }) {
                           Text(text = "email")
                       }
                   }

               }
               //End of column
           }
            //End of row1

            Spacer(modifier = Modifier.height(20.dp))

            //Row1

            Row (
                modifier = Modifier.padding(start = 25.dp)
            ){
                //Column1
                Column {
                    Card (modifier = Modifier
                        .height(100.dp)
                        .width(160.dp)
                    ){
                        Box (modifier = Modifier.fillMaxWidth(),
                            contentAlignment = Alignment.Center
                        ){
                            Image(painter = painterResource(id = R.drawable.dest4),
                                contentDescription ="dest4",
                                modifier = Modifier.fillMaxSize(),
                                contentScale = ContentScale.FillBounds)

                            Image(
                                imageVector =Icons.Default.FavoriteBorder ,
                                contentDescription = "favoriteBorder",
                                modifier = Modifier
                                    .align(Alignment.TopEnd)
                                    .padding(15.dp))
                        }
                    }
                    Spacer(modifier = Modifier.height(10.dp))

                    Text(text = "Frans",
                        fontSize = 20.sp,
                        fontFamily = FontFamily.Serif,
                        fontWeight = FontWeight.ExtraBold ,
                    )
                    Spacer(modifier = Modifier.height(2.dp))
                    Row {
                        Icon(imageVector = Icons.Default.Star, contentDescription ="star", tint = Color.Blue)
                        Icon(imageVector = Icons.Default.Star, contentDescription ="star", tint = Color.Red)
                        Icon(imageVector = Icons.Default.Star, contentDescription ="star", tint = Color.Blue)
                        Icon(imageVector = Icons.Default.Star, contentDescription ="star", tint = Color.Red)
                    }
                    Spacer(modifier = Modifier.height(2.dp))
                    Text(text = "Corril",
                        fontSize = 15.sp,
                        fontFamily = FontFamily.Serif,)

                    Spacer(modifier = Modifier.height(2.dp))
                    Text(text = "From Ksh.4000",
                        fontSize = 20.sp,
                        fontFamily = FontFamily.Serif,
                        fontWeight = FontWeight.ExtraBold ,
                        color = Color.Blue)

                    Spacer(modifier = Modifier.height(2.dp))
                    Row {
                        OutlinedButton(onClick = {
                            val callIntent=Intent(Intent.ACTION_DIAL)
                            callIntent.data="tel:0720245837".toUri()
                            mContext.startActivity(callIntent)
                        }) {
                            Text(text = "Call")
                        }
                        OutlinedButton(onClick = {
                            val shareIntent = Intent(Intent.ACTION_SEND)
                            shareIntent.type = "text/plain"
                            shareIntent.putExtra(Intent.EXTRA_EMAIL, arrayOf("akinyiglory2@gmail.com"))
                            shareIntent.putExtra(Intent.EXTRA_SUBJECT, "subject")
                            shareIntent.putExtra(Intent.EXTRA_TEXT, "Hello, this is the email body")
                            mContext.startActivity(shareIntent)
                        }) {
                            Text(text = "email")
                        }
                    }

                }
                //End of column

                Spacer(modifier = Modifier.width(20.dp))

                //Column2
                Column {
                    Card (modifier = Modifier
                        .height(100.dp)
                        .width(160.dp)
                    ){
                        Box (modifier = Modifier.fillMaxWidth(),
                            contentAlignment = Alignment.Center
                        ){
                            Image(painter = painterResource(id = R.drawable.beaut1),
                                contentDescription ="beaut1",
                                modifier = Modifier.fillMaxSize(),
                                contentScale = ContentScale.FillBounds)

                            Image(
                                imageVector =Icons.Default.FavoriteBorder ,
                                contentDescription = "favoriteBorder",
                                modifier = Modifier
                                    .align(Alignment.TopEnd)
                                    .padding(15.dp))
                        }
                    }
                    Spacer(modifier = Modifier.height(10.dp))

                    Text(text = "Paris",
                        fontSize = 20.sp,
                        fontFamily = FontFamily.Serif,
                        fontWeight = FontWeight.ExtraBold ,
                    )
                    Spacer(modifier = Modifier.height(2.dp))
                    Row {
                        Icon(imageVector = Icons.Default.Star, contentDescription ="star", tint = Color.Blue)
                        Icon(imageVector = Icons.Default.Star, contentDescription ="star", tint = Color.Red)
                        Icon(imageVector = Icons.Default.Star, contentDescription ="star", tint = Color.Blue)
                        Icon(imageVector = Icons.Default.Star, contentDescription ="star", tint = Color.Red)
                    }
                    Spacer(modifier = Modifier.height(2.dp))
                    Text(text = "Tugen",
                        fontSize = 15.sp,
                        fontFamily = FontFamily.Serif,)

                    Spacer(modifier = Modifier.height(2.dp))
                    Text(text = "From Ksh.5000",
                        fontSize = 20.sp,
                        fontFamily = FontFamily.Serif,
                        fontWeight = FontWeight.ExtraBold ,
                        color = Color.Blue)

                    Spacer(modifier = Modifier.height(2.dp))
                    Row {
                        OutlinedButton(onClick = {
                            val callIntent=Intent(Intent.ACTION_DIAL)
                            callIntent.data="tel:0720245837".toUri()
                            mContext.startActivity(callIntent)
                        }) {
                            Text(text = "Call")
                        }
                        OutlinedButton(onClick = {
                            val shareIntent = Intent(Intent.ACTION_SEND)
                            shareIntent.type = "text/plain"
                            shareIntent.putExtra(Intent.EXTRA_EMAIL, arrayOf("akinyiglory2@gmail.com"))
                            shareIntent.putExtra(Intent.EXTRA_SUBJECT, "subject")
                            shareIntent.putExtra(Intent.EXTRA_TEXT, "Hello, this is the email body")
                            mContext.startActivity(shareIntent)
                        }) {
                            Text(text = "email")
                        }
                    }

                }
                //End of column
            }
            //End of row1

            Spacer(modifier = Modifier.height(20.dp))

            //Row1

            Row (
                modifier = Modifier.padding(start = 25.dp)
            ){
                //Column1
                Column {
                    Card (modifier = Modifier
                        .height(100.dp)
                        .width(160.dp)
                    ){
                        Box (modifier = Modifier.fillMaxWidth(),
                            contentAlignment = Alignment.Center
                        ){
                            Image(painter = painterResource(id = R.drawable.house6),
                                contentDescription ="house6",
                                modifier = Modifier.fillMaxSize(),
                                contentScale = ContentScale.FillBounds)

                            Image(
                                imageVector =Icons.Default.Favorite ,
                                contentDescription = "favorite",
                                modifier = Modifier
                                    .align(Alignment.TopEnd)
                                    .padding(15.dp))
                        }
                    }
                    Spacer(modifier = Modifier.height(10.dp))

                    Text(text = "Egypt",
                        fontSize = 20.sp,
                        fontFamily = FontFamily.Serif,
                        fontWeight = FontWeight.ExtraBold ,
                    )
                    Spacer(modifier = Modifier.height(2.dp))
                    Row {
                        Icon(imageVector = Icons.Default.Star, contentDescription ="star", tint = Color.Blue)
                        Icon(imageVector = Icons.Default.Star, contentDescription ="star", tint = Color.Red)
                        Icon(imageVector = Icons.Default.Star, contentDescription ="star", tint = Color.Blue)
                        Icon(imageVector = Icons.Default.Star, contentDescription ="star", tint = Color.Red)
                    }
                    Spacer(modifier = Modifier.height(2.dp))
                    Text(text = "Foreign",
                        fontSize = 15.sp,
                        fontFamily = FontFamily.Serif,)

                    Spacer(modifier = Modifier.height(2.dp))
                    Text(text = "From Ksh.6000",
                        fontSize = 20.sp,
                        fontFamily = FontFamily.Serif,
                        fontWeight = FontWeight.ExtraBold ,
                        color = Color.Blue)

                    Spacer(modifier = Modifier.height(2.dp))
                    Row {
                        OutlinedButton(onClick = {
                            val callIntent=Intent(Intent.ACTION_DIAL)
                            callIntent.data="tel:0720245837".toUri()
                            mContext.startActivity(callIntent)
                        }) {
                            Text(text = "Call")
                        }
                        OutlinedButton(onClick = {
                            val shareIntent = Intent(Intent.ACTION_SEND)
                            shareIntent.type = "text/plain"
                            shareIntent.putExtra(Intent.EXTRA_EMAIL, arrayOf("akinyiglory2@gmail.com"))
                            shareIntent.putExtra(Intent.EXTRA_SUBJECT, "subject")
                            shareIntent.putExtra(Intent.EXTRA_TEXT, "Hello, this is the email body")
                            mContext.startActivity(shareIntent)
                        }) {
                            Text(text = "email")
                        }
                    }

                }
                //End of column

                Spacer(modifier = Modifier.width(20.dp))

                //Column2
                Column {
                    Card (modifier = Modifier
                        .height(100.dp)
                        .width(160.dp)
                    ){
                        Box (modifier = Modifier.fillMaxWidth(),
                            contentAlignment = Alignment.Center
                        ){
                            Image(painter = painterResource(id = R.drawable.dest3),
                                contentDescription ="dest3",
                                modifier = Modifier.fillMaxSize(),
                                contentScale = ContentScale.FillBounds)

                            Image(
                                imageVector =Icons.Default.Favorite ,
                                contentDescription = "favorite",
                                modifier = Modifier
                                    .align(Alignment.TopEnd)
                                    .padding(15.dp))
                        }
                    }
                    Spacer(modifier = Modifier.height(10.dp))

                    Text(text = "Colosseum",
                        fontSize = 20.sp,
                        fontFamily = FontFamily.Serif,
                        fontWeight = FontWeight.ExtraBold ,
                    )
                    Spacer(modifier = Modifier.height(2.dp))
                    Row {
                        Icon(imageVector = Icons.Default.Star, contentDescription ="star", tint = Color.Blue)
                        Icon(imageVector = Icons.Default.Star, contentDescription ="star", tint = Color.Red)
                        Icon(imageVector = Icons.Default.Star, contentDescription ="star", tint = Color.Blue)
                        Icon(imageVector = Icons.Default.Star, contentDescription ="star", tint = Color.Red)
                    }
                    Spacer(modifier = Modifier.height(2.dp))
                    Text(text = "473 reviews",
                        fontSize = 15.sp,
                        fontFamily = FontFamily.Serif,)

                    Spacer(modifier = Modifier.height(2.dp))
                    Text(text = "From Ksh.6000",
                        fontSize = 20.sp,
                        fontFamily = FontFamily.Serif,
                        fontWeight = FontWeight.ExtraBold ,
                        color = Color.Blue)

                    Spacer(modifier = Modifier.height(2.dp))
                    Row {
                        OutlinedButton(onClick = {
                            val callIntent=Intent(Intent.ACTION_DIAL)
                            callIntent.data="tel:0720245837".toUri()
                            mContext.startActivity(callIntent)
                        }) {
                            Text(text = "Call")
                        }
                        OutlinedButton(onClick = {
                            val shareIntent = Intent(Intent.ACTION_SEND)
                            shareIntent.type = "text/plain"
                            shareIntent.putExtra(Intent.EXTRA_EMAIL, arrayOf("akinyiglory2@gmail.com"))
                            shareIntent.putExtra(Intent.EXTRA_SUBJECT, "subject")
                            shareIntent.putExtra(Intent.EXTRA_TEXT, "Hello, this is the email body")
                            mContext.startActivity(shareIntent)
                        }) {
                            Text(text = "email")
                        }
                    }

                }
                //End of column
            }
            //End of row1

            Spacer(modifier = Modifier.height(20.dp))

            //Row1

            Row (
                modifier = Modifier.padding(start = 25.dp)
            ){
                //Column1
                Column {
                    Card (modifier = Modifier
                        .height(100.dp)
                        .width(160.dp)
                    ){
                        Box (modifier = Modifier.fillMaxWidth(),
                            contentAlignment = Alignment.Center
                        ){
                            Image(painter = painterResource(id = R.drawable.dest5),
                                contentDescription ="dest5",
                                modifier = Modifier.fillMaxSize(),
                                contentScale = ContentScale.FillBounds)

                            Image(
                                imageVector =Icons.Default.Favorite ,
                                contentDescription = "favorite",
                                modifier = Modifier
                                    .align(Alignment.TopEnd)
                                    .padding(15.dp))
                        }
                    }
                    Spacer(modifier = Modifier.height(10.dp))

                    Text(text = "Niger",
                        fontSize = 20.sp,
                        fontFamily = FontFamily.Serif,
                        fontWeight = FontWeight.ExtraBold ,
                    )
                    Spacer(modifier = Modifier.height(2.dp))
                    Row {
                        Icon(imageVector = Icons.Default.Star, contentDescription ="star", tint = Color.Blue)
                        Icon(imageVector = Icons.Default.Star, contentDescription ="star", tint = Color.Red)
                        Icon(imageVector = Icons.Default.Star, contentDescription ="star", tint = Color.Blue)
                        Icon(imageVector = Icons.Default.Star, contentDescription ="star", tint = Color.Red)
                    }
                    Spacer(modifier = Modifier.height(2.dp))
                    Text(text = "45 reviews",
                        fontSize = 15.sp,
                        fontFamily = FontFamily.Serif,)

                    Spacer(modifier = Modifier.height(2.dp))
                    Text(text = "From Ksh.3000",
                        fontSize = 20.sp,
                        fontFamily = FontFamily.Serif,
                        fontWeight = FontWeight.ExtraBold ,
                        color = Color.Blue)

                    Spacer(modifier = Modifier.height(2.dp))
                    Row {
                        OutlinedButton(onClick = {
                            val callIntent=Intent(Intent.ACTION_DIAL)
                            callIntent.data="tel:0720245837".toUri()
                            mContext.startActivity(callIntent)
                        }) {
                            Text(text = "Call")
                        }
                        OutlinedButton(onClick = {
                            val shareIntent = Intent(Intent.ACTION_SEND)
                            shareIntent.type = "text/plain"
                            shareIntent.putExtra(Intent.EXTRA_EMAIL, arrayOf("akinyiglory2@gmail.com"))
                            shareIntent.putExtra(Intent.EXTRA_SUBJECT, "subject")
                            shareIntent.putExtra(Intent.EXTRA_TEXT, "Hello, this is the email body")
                            mContext.startActivity(shareIntent)
                        }) {
                            Text(text = "email")
                        }
                    }

                }
                //End of column

                Spacer(modifier = Modifier.width(20.dp))

                //Column2
                Column {
                    Card (modifier = Modifier
                        .height(100.dp)
                        .width(160.dp)
                    ){
                        Box (modifier = Modifier.fillMaxWidth(),
                            contentAlignment = Alignment.Center
                        ){
                            Image(painter = painterResource(id = R.drawable.dest6),
                                contentDescription ="dest6",
                                modifier = Modifier.fillMaxSize(),
                                contentScale = ContentScale.FillBounds)

                            Image(
                                imageVector =Icons.Default.Favorite ,
                                contentDescription = "favorite",
                                modifier = Modifier
                                    .align(Alignment.TopEnd)
                                    .padding(15.dp))
                        }
                    }
                    Spacer(modifier = Modifier.height(10.dp))

                    Text(text ="France",
                        fontSize = 20.sp,
                        fontFamily = FontFamily.Serif,
                        fontWeight = FontWeight.ExtraBold ,
                    )
                    Spacer(modifier = Modifier.height(2.dp))
                    Row {
                        Icon(imageVector = Icons.Default.Star, contentDescription ="star", tint = Color.Blue)
                        Icon(imageVector = Icons.Default.Star, contentDescription ="star", tint = Color.Red)
                        Icon(imageVector = Icons.Default.Star, contentDescription ="star", tint = Color.Blue)
                        Icon(imageVector = Icons.Default.Star, contentDescription ="star", tint = Color.Red)
                    }
                    Spacer(modifier = Modifier.height(2.dp))
                    Text(text = "43 reviews",
                        fontSize = 15.sp,
                        fontFamily = FontFamily.Serif,)

                    Spacer(modifier = Modifier.height(2.dp))
                    Text(text = "From Ksh.3000",
                        fontSize = 20.sp,
                        fontFamily = FontFamily.Serif,
                        fontWeight = FontWeight.ExtraBold ,
                        color = Color.Blue)

                    Spacer(modifier = Modifier.height(2.dp))
                    Row {
                        OutlinedButton(onClick = {
                            val callIntent=Intent(Intent.ACTION_DIAL)
                            callIntent.data="tel:0720245837".toUri()
                            mContext.startActivity(callIntent)
                        }) {
                            Text(text = "Call")
                        }
                        OutlinedButton(onClick = {
                            val shareIntent = Intent(Intent.ACTION_SEND)
                            shareIntent.type = "text/plain"
                            shareIntent.putExtra(Intent.EXTRA_EMAIL, arrayOf("akinyiglory2@gmail.com"))
                            shareIntent.putExtra(Intent.EXTRA_SUBJECT, "subject")
                            shareIntent.putExtra(Intent.EXTRA_TEXT, "Hello, this is the email body")
                            mContext.startActivity(shareIntent)
                        }) {
                            Text(text = "email")
                        }
                    }

                }
                //End of column
            }
            //End of row1

            Spacer(modifier = Modifier.height(20.dp))

        }

    }
}

@Preview(showBackground = true)
@Composable
fun ExplorePreview(){
    Explore()
}