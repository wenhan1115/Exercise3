package com.example.insuranscalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        buttonCalculate.setOnClickListener(){

            val<String> age = spinnerAge.selectedItem.toString()

            var<double> premium = 0
            var<double> gender = 0
            var<double> smoke = 0

            when(age){
                "Less than 17" -> {premium = 60}
                "17 to 25" -> {premium = 70}
                "26 to 30" -> {premium = 90}
                "31 to 40" -> {premium = 120}
               "41 to 55" -> {premium = 150}
               "More than 55" -> {premium = 150}
            }

            if(radioButtonMale.isChecked){
                when(age){
                    "Less than 17" -> {gender = 0}
                    "17 to 25" -> {gender = 50}
                    "26 to  30" -> {gender = 100}
                    "31 to  40" -> {gender = 150}
                    "41 to  55" -> {gender = 200}
                    "More than 55" -> {gender = 200}
                }
            }

            if(checkBoxSmoker.isChecked){
                when(age){
                    "Less than 17" -> {smoke = 0}
                    "17 to  25" -> {smoke = 150}
                    "26 to  30" -> {smoke = 150}
                    "31 to  40" -> {smoke = 200}
                    "41 to  55" -> {smoke = 250}
                    "More than 55" -> {smoke = 300}
                }
            }


            var<double> total = premium + gender + smoke

            textViewPremium.text = "Total Permium: RM"+ total.toString()
        }

        buttonReset.setOnClickListener(){
            textViewPremium.text = "Insurance Premium:"
            spinnerAge.setSelection(0)
            radioButtonMale.isChecked = false
            radioButtonFemale.isChecked = false
            checkBoxSmoker.isChecked = false
        }
        }

}
