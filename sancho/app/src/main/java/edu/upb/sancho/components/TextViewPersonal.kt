package edu.upb.sancho.components

import android.content.Context
import android.widget.TextView
import edu.upb.sancho.R

class TextViewPersonal : TextView {

    constructor(context: Context): super(context) {
        this.text = resources.getText(R.string.hello_world)
        this.setTextColor(resources.getColor(R.color.red_500))
        this.textAlignment = TextView.TEXT_ALIGNMENT_TEXT_END
    }
}