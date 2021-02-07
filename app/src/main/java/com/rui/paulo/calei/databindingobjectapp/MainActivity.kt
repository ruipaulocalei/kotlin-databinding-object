package com.rui.paulo.calei.databindingobjectapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.rui.paulo.calei.databindingobjectapp.databinding.ActivityMainBinding
import com.rui.paulo.calei.databindingobjectapp.models.Product

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_main)
        binding.product = getProducts()
    }

    private fun getProducts(): Product {
        return Product("Chicken", "2000.00")
    }
}