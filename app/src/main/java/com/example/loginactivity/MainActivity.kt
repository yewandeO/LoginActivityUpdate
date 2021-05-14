package com.example.loginactivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import com.example.loginactivity.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    var binding:ActivityMainBinding? = null
    var adapter:FactAdapter? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding?.root)
setUpFact()

    }

    private fun setUpFact(){
        adapter = FactAdapter(this,DummyData.funFacts)
     

    }
    override fun onDestroy(){
        super.onDestroy()
        binding = null
    }

    class MainActivity : AppCompatActivity() {
        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.activity_main)

            signIn()

        }

        private fun signIn() {
            val email = findViewById<TextView>(R.id.email_edit_text)
            val password = findViewById<TextView>(R.id.password_text_input)
            val signInButton = findViewById<Button>(R.id.next_button)

            signInButton.setOnClickListener(){

                if (email.toString().isNullOrEmpty() || password.toString().isNullOrEmpty()){
                            Toast.makeText(this, "Email or password is not provided", Toast.LENGTH_LONG).show()

                        }else{
                    if(email.toString() == "yew@gmail.com" && password.toString() == "12345"){
                        val intent = Intent(this, com.example.loginactivity.MainActivity::class.java)
                        startActivity(intent)
                    }else{
                        Toast.makeText(this,"Wrong Email or Password", Toast.LENGTH_LONG).show()
                    }
                }

            }
        }
    }
}