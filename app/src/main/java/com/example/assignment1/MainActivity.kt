package com.example.assignment1

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    var edtMealType : EditText? = null
    var edtOutput : EditText? = null
    var btnDisplay : Button? = null
    var btnReset : Button? = null
    val meal1 = "Morning"                   //meal 1-6 is declared as constants
    val meal2 = "Mid-Morning"
    val meal3 = "Afternoon"                 //this is used later in the if-statements to compare what the user inputted
    val meal4 = "Mid-Afternoon"             //
    val meal5 = "Dinner"                    //
    val meal6 = "Desert"                    //

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

    edtMealType = findViewById<View>(R.id.edtMealType) as EditText
    edtOutput = findViewById<View>(R.id.edtOutput) as EditText
    btnDisplay = findViewById<View>(R.id.btnDisplay) as Button
    btnReset = findViewById<View>(R.id.btnReset) as Button

////////////////////////////////////////////////////////////////////////////////////////////////////
    btnDisplay!!.setOnClickListener {
        val selected = edtMealType!!.text.toString()

        if (selected == meal1 )                         //meal1 constant is compared to the user input
            edtOutput!!.setText("e.g. Eggs")            //The output is set to the given text
        else if(selected == meal2)                      //meal2 constant is compared to the user input
            edtOutput!!.setText("e.g. Fruit")           //The output is set to the given text
        else if (selected == meal3)                     //meal3 constant is compared to the user input
            edtOutput!!.setText("e.g. Sandwich")        //The output is set to the given text
        else if(selected == meal4)                      //meal4 constant is compared to the user input
            edtOutput!!.setText("e.g. Cake")            //The output is set to the given text
        else if(selected == meal5)                      //meal5 constant is compared to the user input
            edtOutput!!.setText("e.g. Pasta")           //The output is set to the given text
        else if(selected == meal6)                      //meal6 constant is compared to the user input
            edtOutput!!.setText("e.g. Ice Cream")       //The output is set to the given text

        else
            edtOutput!!.setText("Please enter an option exactly as shown above")       //This code is so that when the user`s input is incorrect or there is no input

    }
////////////////////////////////////////////////////////////////////////////////////////////////////

    btnReset!!.setOnClickListener {         //this code is for when the reset button is clicked
        edtOutput!!.setText("")             //all the user text is cleared
        edtMealType!!.setText("")
    }

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}