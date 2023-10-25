package edu.uw.ischool.dkaria.biggobutton

import android.graphics.Typeface
import android.os.Bundle
import androidx.activity.ComponentActivity
import android.widget.Button
import androidx.core.content.ContextCompat

class MainActivity : ComponentActivity() {
    private var counter = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val button = Button(this).apply {
            text = getString(R.string.push_me)
            textSize = 40f
            setTypeface(null, Typeface.ITALIC)
            setTextColor(ContextCompat.getColor(context, R.color.button_text))
            setBackgroundColor(ContextCompat.getColor(context, R.color.button_background))
            setOnClickListener {
                counter++
                text = if (counter == 1) {
                    getString(R.string.pushed_once)
                } else {
                    getString(R.string.pushed_times, counter)
                }
            }
        }

        setContentView(button)
    }
}

