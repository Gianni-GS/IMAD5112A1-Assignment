package com.example.imadproject

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.imadproject.ui.theme.IMADPROJECTTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val timeInput= findViewById<EditText>(R.id.editTime)
        val resultText = findViewById<TextView>(R.id.textResult)
        val pressButton = findViewById<Button>(R.id.btnEnter)
        val resetButton = findViewById<Button>(R.id.btnReset)


        pressButton.setOnClickListener {
            val time = timeInput.text.toString()

            if(time == "Morning"){
                resultText.text = "Send a Good Morning text to your best friend"
            }
            else if(time == "Mid-Morning") {
                resultText.text = "Have a quick chat with your co-workers"
            }




        }



        }
    }


@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    IMADPROJECTTheme {
        Greeting("Android")
    }
}