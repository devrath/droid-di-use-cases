package com.istudio.di.modules.hilt.demos.injection.constructor

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.istudio.di.R
import com.istudio.di.databinding.ActivityDaggerMultiBindingIntoSetBinding
import com.istudio.di.databinding.ActivityHiltConstructorInjectionBinding
import com.istudio.di.modules.hilt.demos.injection.constructor.implementation.Car
import com.istudio.di.modules.hilt.demos.injection.field.implementation.Computer
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class HiltConstructorInjectionActivity : AppCompatActivity() {

    private lateinit var binding: ActivityHiltConstructorInjectionBinding

    @Inject lateinit var car: Car

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHiltConstructorInjectionBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setOnClickListeners();
    }

    private fun setOnClickListeners() {
        binding.apply {
            initiateId.setOnClickListener {
                car.start()
            }
        }
    }

}