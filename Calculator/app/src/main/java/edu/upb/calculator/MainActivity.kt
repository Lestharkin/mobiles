package edu.upb.calculator

import android.os.Bundle
import android.view.View
import android.widget.Button
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
import edu.upb.calculator.ui.theme.CalculatorTheme

class MainActivity : ComponentActivity() {
    private lateinit var input: TextView
    private lateinit var result: TextView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.layout)
        input = findViewById(R.id.inputTextView)
        result = findViewById(R.id.resultTextView)
    }

    fun numberAction(view: View) {
        if (view is Button) {
            if (input.text == "Calculator") {
                input.text = ""
            }

            input.append(view.text)
        }
    }

    fun clearAction(view: View) {
        if (view is Button) {
            input.text = ""
        }
    }

    fun operationAction(view: View) {}
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
    CalculatorTheme {
        Greeting("Android")
    }
}