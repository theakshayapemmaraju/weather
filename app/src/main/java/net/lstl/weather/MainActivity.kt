package net.lstl.weather

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.compose.ui.text.font.FontStyle

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyApp()
        }
    }


    @Preview
    @Composable
    fun MyApp(){

        MaterialTheme(){
            Column {
                ArtistCardCat()
            }
        }
    }



    @Composable
    fun ArtistCardDog() {
        val padding = 8.dp
        var switched by remember { mutableStateOf(true) }
        Card(elevation = 2.dp, modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight()
                ) {
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(padding),
                horizontalAlignment = Alignment.CenterHorizontally,verticalArrangement = Arrangement.Center
            ) {
                Column(
                    modifier = Modifier
                        .fillMaxWidth(),horizontalAlignment = Alignment.CenterHorizontally
                ) {

                    Switch(
                        checked = switched,
                        modifier = Modifier.padding(padding),
                        onCheckedChange = { switched = it },
                    )
                }


                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                ) {
                    Row( modifier = Modifier.fillMaxWidth()) {
                        Text(
                            "Hyderabad, Telangana Weather", textAlign = TextAlign.Center,modifier = Modifier
                                .fillMaxWidth()
                        )
                    }

                }
                Column {
                    Text(
                        "42°",
                        modifier = Modifier.padding(padding),
                        fontSize = 32.sp,
                        fontWeight = FontWeight.Bold
                    )
                }
                Column {
                    Image(
                        painterResource(R.mipmap.dog_sunny_foreground),
                        "Image",
                        contentScale = ContentScale.Crop,
                        modifier = Modifier.width(200.dp)
                    )
                }
                Column(horizontalAlignment = Alignment.CenterHorizontally) {
                    Text("23rd  March", modifier = Modifier.padding(padding))
                    Text( "Noon", modifier = Modifier.padding(padding))
                }
                Column() {
                    var sliderState by remember { mutableStateOf(5f) }
                    Slider(value = sliderState, modifier = Modifier
                        .fillMaxWidth()
                        .padding(8.dp),
                        valueRange = 0f..10f,
                        onValueChange = { newValue ->
                            sliderState = newValue
                        }
                    )
                }



                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(padding),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Card(
                        elevation = 4.dp, modifier = Modifier
                            .fillMaxWidth()
                            .padding(padding),backgroundColor = Color(255,150,0)
                    ) {
                        Column(
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(padding)
                        ) {
                            Row(verticalAlignment = Alignment.CenterVertically) {

                                Column {
                                    Text(
                                        "News",
                                        modifier = Modifier.padding(padding, 0.dp, 0.dp, 0.dp),fontWeight = FontWeight.Bold
                                    )
                                    Text(
                                        "23rd March is World Puppy Day",
                                        modifier = Modifier.padding(padding, 0.dp, 0.dp, 0.dp)
                                    )
                                }

                            }
                        }
                    }
                }
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(padding),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Card(
                        elevation = 4.dp, modifier = Modifier
                            .fillMaxWidth()
                            .padding(padding),backgroundColor = Color(255,150,0)
                    ) {
                        Column(
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(padding)
                        ) {
                            Row(verticalAlignment = Alignment.CenterVertically) {

                                Column {
                                    Text(
                                        "Random Fact",
                                        modifier = Modifier.padding(padding, 0.dp, 0.dp, 0.dp),fontWeight = FontWeight.Bold
                                    )
                                    Text(
                                        "Hightest Temperature ever recorded: 56.7° in 1913",
                                        modifier = Modifier.padding(padding, 0.dp, 0.dp, 0.dp)
                                    )
                                }

                            }
                        }
                    }
                }

            }

        }
    }

    @Composable
    fun ArtistCardCat() {
        val padding = 8.dp
        var switched by remember { mutableStateOf(true) }
        Card(elevation = 2.dp, modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight()
        ) {
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(padding),
                horizontalAlignment = Alignment.CenterHorizontally,verticalArrangement = Arrangement.Center
            ) {
                Column(
                    modifier = Modifier
                        .fillMaxWidth(),horizontalAlignment = Alignment.CenterHorizontally
                ) {

                    Switch(
                        checked = false,
                        modifier = Modifier.padding(padding),
                                onCheckedChange = { switched = it },
                    )
                }


                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                ) {
                    Row( modifier = Modifier.fillMaxWidth()) {
                        Text(
                            "Washington, DC Weather", textAlign = TextAlign.Center,modifier = Modifier
                                .fillMaxWidth()
                        )
                    }

                }
                Column {
                    Text(
                        "13°",
                        modifier = Modifier.padding(padding),
                        fontSize = 32.sp,
                        fontWeight = FontWeight.Bold
                    )
                }
                Column {
                    Image(
                        painterResource(R.mipmap.catrain_foreground),
                        "Image",
                        contentScale = ContentScale.Crop,
                        modifier = Modifier.width(200.dp)
                    )
                }
                Column(horizontalAlignment = Alignment.CenterHorizontally) {
                    Text("23rd  March", modifier = Modifier.padding(padding))
                    Text( "Noon", modifier = Modifier.padding(padding))
                }
                Column() {
                    var sliderState by remember { mutableStateOf(5f) }
                    Slider(value = sliderState, modifier = Modifier
                        .fillMaxWidth()
                        .padding(8.dp),
                        valueRange = 0f..10f,
                        onValueChange = { newValue ->
                            sliderState = newValue
                        }
                    )
                }



                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(padding),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Card(
                        elevation = 4.dp, modifier = Modifier
                            .fillMaxWidth()
                            .padding(padding),backgroundColor = Color(0,150,255)
                    ) {
                        Column(
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(padding)
                        ) {
                            Row(verticalAlignment = Alignment.CenterVertically) {

                                Column {
                                    Text(
                                        "News",
                                        modifier = Modifier.padding(padding, 0.dp, 0.dp, 0.dp),fontWeight = FontWeight.Bold
                                    )
                                    Text(
                                        "Washington is one of the top-ranked states to find a remote job",
                                        modifier = Modifier.padding(padding, 0.dp, 0.dp, 0.dp)
                                    )
                                }

                            }
                        }
                    }
                }
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(padding),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Card(
                        elevation = 4.dp, modifier = Modifier
                            .fillMaxWidth()
                            .padding(padding),backgroundColor = Color(0,150,255)
                    ) {
                        Column(
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(padding)
                        ) {
                            Row(verticalAlignment = Alignment.CenterVertically) {

                                Column {
                                    Text(
                                        "Random Fact",
                                        modifier = Modifier.padding(padding, 0.dp, 0.dp, 0.dp),fontWeight = FontWeight.Bold
                                    )
                                    Text(
                                        "Not all rain drops that fall from the sky reach the ground",
                                        modifier = Modifier.padding(padding, 0.dp, 0.dp, 0.dp)
                                    )
                                }

                            }
                        }
                    }
                }

            }

        }
    }

}
