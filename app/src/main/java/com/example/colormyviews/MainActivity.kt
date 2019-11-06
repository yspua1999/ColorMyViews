package com.example.colormyviews

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setListeners()
    }

    private fun makeColored(view: View) {
        when(view.id){
            R.id.box_one_text -> view.setBackgroundResource(R.drawable.blue_image)
            R.id.box_two_text -> view.setBackgroundResource(R.drawable.water_image)
            R.id.box_three_text -> view.setBackgroundResource(R.drawable.water_image2)
            R.id.box_four_text -> view.setBackgroundResource(R.drawable.orange_image)
            R.id.box_five_text -> view.setBackgroundResource(R.drawable.rain_image)
            R.id.one -> view.setBackgroundColor(Color.BLACK)
            R.id.two -> view.setBackgroundResource(R.color.my_red)
            R.id.three -> view.setBackgroundColor(Color.CYAN)
            R.id.four -> view.setBackgroundColor(Color.DKGRAY)
            R.id.five -> view.setBackgroundResource(R.color.my_green)
            R.id.six -> view.setBackgroundColor(Color.MAGENTA)
            R.id.seven -> view.setBackgroundColor(Color.LTGRAY)
            R.id.eight -> view.setBackgroundResource(R.color.my_yellow)
            R.id.nine -> view.setBackgroundColor(Color.GRAY)
            else ->  view.setBackgroundResource(R.drawable.mountain_image)

            //for buttons (using custom color for background)
            /*R.id.red_button -> box_three_text.setBackgroundResource(R.color.my_red)
            R.id.yellow_button -> box_four_text.setBackgroundResource(R.color.my_yellow)
            R.id.green_button -> box_five_text.setBackgroundResource(R.color.my_green)
            else -> view.setBackgroundColor(Color.LTGRAY)*/

        }
    }

    private fun setListeners() {

        val boxOneText = findViewById<TextView>(R.id.box_one_text)
        val boxTwoText = findViewById<TextView>(R.id.box_two_text)
        val boxThreeText = findViewById<TextView>(R.id.box_three_text)
        val boxFourText = findViewById<TextView>(R.id.box_four_text)
        val boxFiveText = findViewById<TextView>(R.id.box_five_text)
        val one = findViewById<TextView>(R.id.one)
        val two = findViewById<TextView>(R.id.two)
        val three = findViewById<TextView>(R.id.three)
        val four = findViewById<TextView>(R.id.four)
        val five = findViewById<TextView>(R.id.five)
        val six = findViewById<TextView>(R.id.six)
        val seven = findViewById<TextView>(R.id.seven)
        val eight = findViewById<TextView>(R.id.eight)
        val nine = findViewById<TextView>(R.id.nine)
        val rootConstraintLayout = findViewById<View>(R.id.constraint_layout)


        val clickableViews: List<View> =
            listOf(
                boxOneText,
                boxTwoText,
                boxThreeText,
                boxFourText,
                boxFiveText,
                one,
                two,
                three,
                four,
                five,
                six,
                seven,
                eight,
                nine,
                rootConstraintLayout
            )

        for (item in clickableViews) {
            item.setOnClickListener { makeColored(it) }
        }
    }
}
