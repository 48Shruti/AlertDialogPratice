package com.shruti.alertdialogpratice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import com.shruti.alertdialogpratice.databinding.ActivityAlertDialog1Binding

class AlertDialog1 : AppCompatActivity() {
    lateinit var binding : ActivityAlertDialog1Binding
    var count = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAlertDialog1Binding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btnclick.setOnClickListener {
            if (binding.etnumber.text.isNullOrEmpty()) {
                binding.etnumber.error = "Enter number"
                Toast.makeText(this, "Enter number", Toast.LENGTH_SHORT).show()
            } else {
                val inputText = binding.etnumber.text.toString()
                count = if (inputText.isNotEmpty()) {
                    inputText.toInt()
                } else {
                    0
                }
                AlertDialog.Builder(this).apply {
                    setTitle("Add or subtract")
                    setMessage("If you want to add number then click add or you want to substract then click sub")
                    setPositiveButton("added") { _, _ ->
                        count += count
                        binding.etnumber.setText(count.toString())
                        Toast.makeText(this@AlertDialog1, "add ", Toast.LENGTH_SHORT).show()
                    }
                    setNegativeButton("subtract") { _, _ ->
                        count -= count
                        binding.etnumber.setText(count.toString())
                        Toast.makeText(this@AlertDialog1, "sub ", Toast.LENGTH_SHORT).show()
                    }
                    setNeutralButton("reset") { _, _, ->
                        count = 0
                        binding.etnumber.setText(count.toString())
                        Toast.makeText(this@AlertDialog1, "reset", Toast.LENGTH_SHORT).show()
                    }
                }.show()
            }
        }
    }
}