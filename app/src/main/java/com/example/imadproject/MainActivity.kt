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

        // Declaration of variables
        val timeInput = findViewById<EditText>(R.id.editTime)
        val resultText = findViewById<TextView>(R.id.textResult)
        val pressButton = findViewById<Button>(R.id.btnEnter)
        val resetButton = findViewById<Button>(R.id.btnReset)

        // Press Button
        pressButton.setOnClickListener {
            val time = timeInput.text.toString()

            if (time == "Morning") {
                resultText.text = "Send a Good Morning text to your best friend"

            } else if (time == "Mid-Morning") {
                resultText.text = "Have a quick chat with your co-workers"

            } else if (time == "Afternoon") {
                resultText.text = "Send a funny video to your best friend on TikTok"

            } else if (time == "Afternoon relax time") {
                resultText.text = "Send a thoughtful message to any of your siblings"

            } else if (time == "Dinner") {
                resultText.text = "Send pictures of your dinner to your parents"

            } else if (time == "After Dinner") {
                resultText.text = "Call your parents for a 10-minute chat"

            } else if (time == "Nighttime") {
                resultText.text = "Before you go to bed, Send a Good Night text to your best friend"

            } else {
                resultText.text = "Invalid input, Please enter the correct time of day"
            }
        }
        // Reset Button
        resetButton.setOnClickListener {
            timeInput.text.clear()
            resultText.text = "Result will appear here"

        }

    }
}






