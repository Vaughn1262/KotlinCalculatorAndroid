package com.example.drawingapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() , View.OnClickListener {
    //initializes the variable used in the xml file
    lateinit var btn_Add : Button
    lateinit var btn_Sub : Button
    lateinit var btn_Mul : Button
    lateinit var btn_Div : Button
    lateinit var text_a : EditText
    lateinit var text_b : EditText
    lateinit var ResultTextview : TextView

    //Sets the buttons to work as intended and sets listeners to them
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btn_Add = findViewById(R.id.btn_1)
        btn_Sub = findViewById(R.id.btn_2)
        btn_Mul = findViewById(R.id.btn_3)
        btn_Div = findViewById(R.id.btn_4)
        text_a = findViewById(R.id.text_a)
        text_b = findViewById(R.id.text_b)
        ResultTextview = findViewById(R.id.Resultid)
        btn_Add.setOnClickListener(this)
        btn_Sub.setOnClickListener(this)
        btn_Mul.setOnClickListener(this)
        btn_Div.setOnClickListener(this)
    }

    //If button is clicked do that operation
    //can't use switch statements so when was used.
    override fun onClick(v: View?){
        var A = text_a.text.toString().toDouble()
        var B = text_b.text.toString().toDouble()
        var Result = 0.0
        var operation = ""
        when(v?.id){
            R.id.btn_1 ->{
                Result = A + B
                operation = "+"
            }
            R.id.btn_2 ->{
                Result = A - B
                operation = "-"
            }
            R.id.btn_3 ->{
                Result = A * B
                operation = "*"
            }
            R.id.btn_4 ->{
                Result = A / B
                operation = "/"
            }
        }
        //Displays the equation that was entered into the calculator back to user
        ResultTextview.text = "$A $operation $B = $Result"
    }
}