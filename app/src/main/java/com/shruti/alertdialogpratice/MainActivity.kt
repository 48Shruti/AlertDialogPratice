package com.shruti.alertdialogpratice

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.shruti.alertdialogpratice.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding :ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btnalert1.setOnClickListener {
            val intent = Intent(this,AlertDialog1::class.java)
            startActivity(intent)
        }
        binding.btnalert2.setOnClickListener {
            val intent = Intent(this,AlertDialog2::class.java)
            startActivity(intent)
        }
        binding.btnuitask.setOnClickListener {
            val intent = Intent(this,UiTask::class.java)
            startActivity(intent)
        }
    }
}