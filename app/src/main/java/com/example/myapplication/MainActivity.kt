package com.example.myapplication


import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Divider
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyApp()
        }
    }
}

@Preview(showBackground = true)
@Composable
fun MyApp() {
    Box(
        modifier = Modifier
            .fillMaxHeight()
            .width(400.dp)
            .background(Color(0xFF050B18)), // Установите нужный цвет фона
    ) {
        Column(
            modifier = Modifier
                .verticalScroll(rememberScrollState())
                .fillMaxHeight()
        ){
            Image(
                painter = painterResource(id = R.drawable.dota),
                contentDescription = null,
                modifier = Modifier.fillMaxWidth()
            )
            Row(
                modifier = Modifier
                    .padding(horizontal = 32.dp)
                    .offset(y = -36.dp)
            )
            {
                Box(
                    modifier = Modifier
                        .size(80.dp)
                        .background(Color(0xFF1F2430))
                ){
                    Box(
                        modifier = Modifier
                            .size(76.dp)
                            .background(Color.Black)
                            .align(Alignment.Center)
                    ){
                        Image(
                            painter = painterResource(id = R.drawable.logo),
                            contentDescription = null,
                            modifier = Modifier
                                .size(50.dp)
                                .align(Alignment.Center)
                        )
                    }
                }
                Column(
                    modifier = Modifier
                        .padding(horizontal = 4.dp)
                        .align(Alignment.CenterVertically)
                )
                {
                    Text(
                        text = "DoTA2",
                        color = Color.White,
                        fontSize = 32.sp
                    )
                    Row {
                        Image(
                            painter = painterResource(id = R.drawable.star),
                            contentDescription = null,
                            modifier = Modifier.size(15.dp)
                        )
                        Image(
                            painter = painterResource(id = R.drawable.star),
                            contentDescription = null,
                            modifier = Modifier.size(15.dp)
                        )
                        Image(
                            painter = painterResource(id = R.drawable.star),
                            contentDescription = null,
                            modifier = Modifier.size(15.dp)
                        )
                        Image(
                            painter = painterResource(id = R.drawable.star),
                            contentDescription = null,
                            modifier = Modifier.size(15.dp)
                        )
                        Image(
                            painter = painterResource(id = R.drawable.star),
                            contentDescription = null,
                            modifier = Modifier.size(15.dp)
                        )
                        Text(
                            text = "70M",
                            color = Color.White,
                            fontSize = 16.sp,
                            modifier = Modifier
                                .padding(horizontal = 2.dp)
                                .offset(y = -1.dp)
                        )
                    }
                }

            }
            Row(
                modifier = Modifier
                    .padding(horizontal = 18.dp, vertical = 16.dp)
            )
            {
                Box(
                    modifier = Modifier
                        .background(Color(0xFF0E3049))
                        .width(60.dp)

                ){
                    Text(
                        text = "MOBA",
                        fontSize = 16.sp,
                        color = Color(0xFF44A9F4),
                        modifier = Modifier.align(Alignment.Center),
                    )
                }
                Spacer(modifier = Modifier.width(16.dp))
                Box(
                    modifier = Modifier
                        .background(Color(0xFF0E3049))
                        .width(120.dp)
                ){
                    Text(
                        text = "MULTIPLAYER",
                        fontSize = 16.sp,
                        color = Color(0xFF44A9F4),
                        modifier = Modifier.align(Alignment.Center)
                    )
                }
                Spacer(modifier = Modifier.width(16.dp))
                Box(
                    Modifier
                        .background(Color(0xFF0E3049))
                        .width(100.dp)
                ){
                    Text(
                        text = "STRATEGY",
                        fontSize = 16.sp,
                        color = Color(0xFF44A9F4),
                        modifier = Modifier.align(Alignment.Center),
                    )
                }
            }
            Text(
                text = "Dota 2 is a multiplayer online battle arena (MOBA) game which has two teams of five players compete to collectively destroy a large structure defended by the opposing team known as the \"Ancient\", whilst defending their own.",
                color = Color.White,
                modifier = Modifier
                    .padding(horizontal = 16.dp),
                fontSize = 12.sp
            )
            LazyRow(
                modifier = Modifier
                    .padding(horizontal = 16.dp, vertical = 16.dp)
            )
            {
                item{
                    Image(
                        painter = painterResource(id = R.drawable.photo1),
                        contentDescription = null,
                        modifier = Modifier.width(300.dp)
                    )
                }
                item{
                    Spacer(modifier = Modifier.width(16.dp))
                }
                item{
                    Image(
                        painter = painterResource(id = R.drawable.photo2),
                        contentDescription = null,
                        modifier = Modifier.width(300.dp)
                    )
                }
            }
            Column(modifier = Modifier.padding(horizontal = 16.dp)) {
                Text(text = "Review & Rating", color = Color.White, fontSize = 24.sp)
                Row {
                    Text(text = "4.9", color = Color.White, fontSize = 40.sp)
                    Column(
                        modifier = Modifier.padding(vertical = 16.dp, horizontal = 8.dp)
                    ) {
                        Row {
                            Image(
                                painter = painterResource(id = R.drawable.star),
                                contentDescription = null,
                                modifier = Modifier.size(15.dp)
                            )
                            Image(
                                painter = painterResource(id = R.drawable.star),
                                contentDescription = null,
                                modifier = Modifier.size(15.dp)
                            )
                            Image(
                                painter = painterResource(id = R.drawable.star),
                                contentDescription = null,
                                modifier = Modifier.size(15.dp)
                            )
                            Image(
                                painter = painterResource(id = R.drawable.star),
                                contentDescription = null,
                                modifier = Modifier.size(15.dp)
                            )
                            Image(
                                painter = painterResource(id = R.drawable.half_star),
                                contentDescription = null,
                                modifier = Modifier.size(15.dp)
                            )
                        }
                        Text(text = "70M Reviews", color = Color.White, fontSize = 8.sp)
                    }
                }
            }
            Column(modifier = Modifier.padding(horizontal = 16.dp, vertical = 16.dp)) {
                Row {
                    Image(
                        painter = painterResource(id = R.drawable.avatar1),
                        contentDescription = null,
                        modifier = Modifier.width(50.dp)
                    )
                    Column(modifier = Modifier.padding(horizontal = 8.dp)) {
                        Text(
                            text = "Auguste Conte",
                            color = Color.White,
                            fontSize = 16.sp
                        )
                        Text(
                            text = "February 14, 2023",
                            color = Color(0xFFA8ADB7),
                            fontSize = 16.sp
                        )
                    }
                }
                Text(
                    text = "“Once you start to learn its secrets, there’s a wild and exciting variety of play here that’s unmatched, even by its peers.”",
                    color = Color.White,
                    fontSize = 16.sp,
                    modifier = Modifier.padding(vertical = 8.dp)
                )
            }
            Divider(
                color = Color(0xFF1A1F29),
                thickness = 2.dp,
                modifier = Modifier
                    .width(350.dp)
                    .align(Alignment.CenterHorizontally)
            )
            Column(modifier = Modifier.padding(horizontal = 16.dp, vertical = 16.dp)) {
                Row {
                    Image(
                        painter = painterResource(id = R.drawable.avatar2),
                        contentDescription = null,
                        modifier = Modifier.width(50.dp)
                    )
                    Column(modifier = Modifier.padding(horizontal = 8.dp)) {
                        Text(
                            text = "Jang Marcelino",
                            color = Color.White,
                            fontSize = 16.sp
                        )
                        Text(
                            text = "February 14, 2023",
                            color = Color(0xFFA8ADB7),
                            fontSize = 16.sp
                        )
                    }
                }
                Text(
                    text = "“Once you start to learn its secrets, there’s a wild and exciting variety of play here that’s unmatched, even by its peers.”",
                    color = Color.White,
                    fontSize = 16.sp,
                    modifier = Modifier.padding(vertical = 8.dp)
                )
            }
            Button(
                colors = ButtonDefaults.buttonColors(Color(0xFFF4D144)),
                onClick = {},
                modifier = Modifier
                    .width(350.dp)
                    .height(70.dp)
                    .align(Alignment.CenterHorizontally),
                shape = RoundedCornerShape(16.dp),
            ) {
                Text(text = "Install", fontSize = 32.sp, color = Color(0xFF050B18))
            }
        }
    }
}