package com.example.sema.ui.theme.screens.DashboardScreen

import android.widget.Toast
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.firebasestorage.R
import com.example.sema.navigation.ROUT_CLOTHING
import com.example.sema.ui.theme.lBlue


@Composable
fun DashboardScreen(navController: NavHostController){
    Column(modifier = Modifier.fillMaxSize()) {

        val mContext = LocalContext.current


        TopAppBar(title = { Text(text = "Amazon Shop")},
            backgroundColor = lBlue)
        
        //End of TopAppBar
        Spacer(modifier = Modifier.height(30.dp))
        
        Row {
            Column {
                Text(text = "Amazon", fontSize = 30.sp, color = lBlue)
                Text(text = "Shop from A to z")
            }
            Spacer(modifier = Modifier.width(80.dp))

            Image(painter = painterResource(id = R.drawable.amazon),
                contentDescription ="amazon",
                modifier = Modifier.size(100.dp))
        }
        //End of row

        Spacer(modifier = Modifier.height(30.dp))
        Column {
            //Row1
            Row {
               Card(modifier = Modifier
                   .clickable {
                       navController.navigate(ROUT_CLOTHING)
                       Toast.makeText(mContext,
                           "Opening ClothScreen",
                           Toast.LENGTH_LONG).show()
                   }
                   .size(width = 150.dp, height = 160.dp),
                   elevation = 10.dp) {
                   Column {
                       Box (modifier = Modifier.fillMaxWidth(),
                           contentAlignment = Alignment.Center){
                           Image(painter = painterResource(id = R.drawable.h2),
                               contentDescription ="amazon",
                               modifier = Modifier.size(100.dp))

                       }
                       Text(text = "House", fontSize = 20.sp,
                           color = lBlue, modifier = Modifier.fillMaxWidth(),
                           textAlign = TextAlign.Center
                       )
                   }

               }
                Spacer(modifier = Modifier.width(40.dp))

                Card(modifier = Modifier
                    .size(width = 150.dp, height = 160.dp),
                    elevation = 10.dp) {
                    Column {
                        Box (modifier = Modifier.fillMaxWidth(),
                            contentAlignment = Alignment.Center){
                            Image(painter = painterResource(id = R.drawable.g1),
                                contentDescription ="amazon",
                                modifier = Modifier.size(100.dp))

                        }
                        Text(text = "Grocery", fontSize = 20.sp,
                            color = lBlue, modifier = Modifier.fillMaxWidth(),
                            textAlign = TextAlign.Center
                        )
                    }

                }
            }
            //End of Row 1

            Spacer(modifier = Modifier.height(40.dp))

            //Row2
            Row {
                Card(modifier = Modifier
                    .size(width = 150.dp, height = 160.dp),
                    elevation = 10.dp) {
                    Column {
                        Box (modifier = Modifier.fillMaxWidth(),
                            contentAlignment = Alignment.Center){
                            Image(painter = painterResource(id = R.drawable.c),
                                contentDescription ="amazon",
                                modifier = Modifier.size(100.dp))

                        }
                        Text(text = "Fruit", fontSize = 20.sp,
                            color = lBlue, modifier = Modifier.fillMaxWidth(),
                            textAlign = TextAlign.Center
                        )
                    }

                }
                Spacer(modifier = Modifier.width(40.dp))

                Card(modifier = Modifier
                    .size(width = 150.dp, height = 160.dp),
                    elevation = 10.dp) {
                    Column {
                        Box (modifier = Modifier.fillMaxWidth(),
                            contentAlignment = Alignment.Center){
                            Image(painter = painterResource(id = R.drawable.elect),
                                contentDescription ="amazon",
                                modifier = Modifier.size(100.dp))

                        }
                        Text(text = "Electricity", fontSize = 20.sp,
                            color = lBlue, modifier = Modifier.fillMaxWidth(),
                            textAlign = TextAlign.Center
                        )
                    }

                }
            }
            //End of Row 2

            Spacer(modifier = Modifier.height(40.dp))

            //Row3
            Row {
                Card(modifier = Modifier
                    .size(width = 150.dp, height = 160.dp),
                    elevation = 10.dp) {
                    Column {
                        Box (modifier = Modifier.fillMaxWidth(),
                            contentAlignment = Alignment.Center){
                            Image(painter = painterResource(id = R.drawable.ph),
                                contentDescription ="amazon",
                                modifier = Modifier.size(100.dp))

                        }
                        Text(text = "Pharmacy", fontSize = 20.sp,
                            color = lBlue, modifier = Modifier.fillMaxWidth(),
                            textAlign = TextAlign.Center
                        )
                    }

                }
                Spacer(modifier = Modifier.width(40.dp))

                Card(modifier = Modifier
                    .size(width = 150.dp, height = 160.dp),
                    elevation = 10.dp) {
                    Column {
                        Box (modifier = Modifier.fillMaxWidth(),
                            contentAlignment = Alignment.Center){
                            Image(painter = painterResource(id = R.drawable.be),
                                contentDescription ="amazon",
                                modifier = Modifier.size(100.dp))

                        }
                        Text(text = "Beauty", fontSize = 20.sp,
                            color = lBlue, modifier = Modifier.fillMaxWidth(),
                            textAlign = TextAlign.Center
                        )
                    }

                }
            }
            //End of Row 3
        }

    }

}

@Preview(showBackground = true)
@Composable
fun DashboardScreenPreview(){
    DashboardScreen(rememberNavController())
}