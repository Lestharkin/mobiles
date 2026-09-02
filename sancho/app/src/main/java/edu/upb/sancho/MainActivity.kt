package edu.upb.sancho

import android.graphics.Color
import android.os.Bundle
import android.widget.LinearLayout
import android.widget.TextView
import android.widget.Toast
import androidx.activity.ComponentActivity
import edu.upb.sancho.components.TextViewPersonal

class MainActivity : ComponentActivity() {

    lateinit var mainLayout: LinearLayout


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity)

        mainLayout = findViewById(R.id.mainLayout)

        /*
        val textView = TextView(this)
        textView.text = getString(R.string.hello_world)
        textView.setTextColor(getColor(R.color.red_500))
        textView.textAlignment = TextView.TEXT_ALIGNMENT_TEXT_END

        mainLayout.addView(textView)
        */
        val textViewPersonal = TextViewPersonal(this)
        val textViewPersonal2 = TextViewPersonal(this)
        textViewPersonal2.setBackgroundColor(Color.parseColor("#349854"))
        mainLayout.addView(textViewPersonal)
        mainLayout.addView(textViewPersonal2)
    }

}
