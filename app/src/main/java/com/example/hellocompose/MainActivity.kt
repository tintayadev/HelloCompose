package com.example.hellocompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.example.hellocompose.ui.theme.HelloComposeTheme
import org.intellij.lang.annotations.JdkConstants

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {

            HelloCompose()
        }
    }
}

@Composable
fun HelloCompose(){
    HelloComposeTheme() {
        Card(
            elevation = 4.dp,
            shape = MaterialTheme.shapes.large
        ) {
            Column(
                modifier = Modifier.padding(8.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Image(
                    painterResource(id = R.drawable.avatar),
                    contentDescription = null,
                    modifier = Modifier.size(250.dp, 150.dp)
                )
                Text("Este curso es el mejor!!",
                    style = MaterialTheme.typography.h4)
                Text(
                    "Curso de Jetpack compose",
                    style = MaterialTheme.typography.body1,
                )
                Button(onClick = {

                }, modifier = Modifier.padding(top = 16.dp),
                    shape = MaterialTheme.shapes.large){
                    Text("Click me")
                }
            }
        }
    }

}

@Preview(
    showBackground = true
)

@Composable
fun HelloComposePreview(){
    HelloCompose()
}