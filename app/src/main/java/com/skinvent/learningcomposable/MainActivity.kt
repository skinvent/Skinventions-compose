package com.skinvent.learningcomposable

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Row
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp

import com.skinvent.learningcomposable.ui.theme.MyComposeApplicationTheme

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyComposeApplicationTheme {
                // A surface container using the 'background' color from the theme
                Surface(modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background) {
                    itemer()
                }
            }
        }
    }
}

@Composable
fun Greeting(modifier: Modifier = Modifier) {
    Text(text = "Skinvent Compose", modifier = modifier)
}

@Preview(showBackground = true)

@Composable 
fun itemer (){
    Row{
       Image( painter = painterResource (R.mipmap.ic_launcher)
        ,
        ) 
    }
    Column{
        Text(text="Hello this Skinventions")
        Text(text="Learning Jetpack Compose")
    }
    
    
}
         