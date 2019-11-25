package com.example.bmi_calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.math.pow

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnCal.setOnClickListener(){
            val weight :Double = txtWeight.text.toString().toDouble()
            val height :Double = txtHeight.text.toString().toDouble()

            val BMI:Double = weight / (height * height)

            if (BMI>=25){
                imageView3.setImageResource(R.drawable.over);
                lblBMI.text = "BMI : "+ "%.2f".format(BMI) +"(Over)"
            }else if(BMI<=18.5){
                imageView3.setImageResource(R.drawable.under);
                lblBMI.text = "BMI : "+ "%.2f".format(BMI) +"(Under)"
            }else{
                imageView3.setImageResource(R.drawable.normal);
                lblBMI.text = "BMI : "+ "%.2f".format(BMI) +"(Normal)"
            }
        }
        btnReset.setOnClickListener(){
            imageView3.setImageResource(R.drawable.empty)
            lblBMI.text = ""
            txtWeight.text = null
            txtHeight.text = null
            txtWeight.requestFocus()
        }
    }
}
