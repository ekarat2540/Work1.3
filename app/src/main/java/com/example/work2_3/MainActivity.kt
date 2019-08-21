package com.example.work2_3

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setListeners()
    }
    private fun makeColored(view: View){
        when (view.id){
            R.id.box_one_textbox -> view.setBackgroundColor(Color.DKGRAY)
            R.id.box_two_textbox -> view.setBackgroundColor(Color.GRAY)
            R.id.box_three_text_textbox -> view.setBackgroundColor(Color.BLUE)
            R.id.box_four_text_textbox -> view.setBackgroundColor(Color.MAGENTA)
            R.id.box_five_text_textbox -> view.setBackgroundColor(Color.BLUE)
            else -> view.setBackgroundColor(Color.LTGRAY)
        }
    }

    private fun setListeners(){
        val boxOneText = findViewById<TextView>(R.id.box_one_text)
        val boxTwoText = findViewById<TextView>(R.id.box_two_text)
        val boxThreeText = findViewById<TextView>(R.id.box_three_text)
        val boxFourText = findViewById<TextView>(R.id.box_four_text)
        val boxFiveText = findViewById<TextView>(R.id.box_five_text)

        val rootConstraintLayout = findViewById<View>(R.id.constraint_layout)
        val clickableViews: List<View> =
                listOf(boxOneText,boxTwoText,boxThreeText,boxFourText,boxFiveText)

        for(item in clickableViews) {
            item.setOnClickListener { makeColored(it)}
        }

    }
}
