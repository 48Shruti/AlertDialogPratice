package com.shruti.alertdialogpratice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.shruti.alertdialogpratice.databinding.ActivityAlertDialog2Binding

class AlertDialog2 : AppCompatActivity() {
    lateinit var binding: ActivityAlertDialog2Binding
    var count = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAlertDialog2Binding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btnsum.setOnClickListener {
            count += 2
            binding.tvzero.setText(count.toString())
            Toast.makeText(this,"sum by 2" , Toast.LENGTH_SHORT).show()
        }
        binding.btnmultiply.setOnClickListener {
            count *= 2
            binding.tvzero.setText(count.toString())
            Toast.makeText(this,"multiple by 2" , Toast.LENGTH_SHORT).show()
        }
        binding.btnsubtract.setOnClickListener {
            count -= 2
            binding.tvzero.setText(count.toString())
            Toast.makeText(this,"substract by 2" , Toast.LENGTH_SHORT).show()
        }
        binding.btndivide.setOnClickListener {
            count /= 2
            binding.tvzero.setText(count.toString())
            Toast.makeText(this,"divide by 2" , Toast.LENGTH_SHORT).show()
        }
    }
}
