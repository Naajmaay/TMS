package com.example.a1634201903271905024191606189796189579_tenantmanagementlab2

import android.os.Bundle
import androidx.activity.ComponentActivity
import com.example.a1634201903271905024191606189796189579_tenantmanagementlab2.databinding.ActivityMainBinding

class MainActivity : ComponentActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.saveButton.setOnClickListener {
            val name = binding.tenantNameEditText.text.toString()
            val phone = binding.phoneEditText.text.toString()
            val rent = binding.rentEditText.text.toString()

            val tenant = TenantInfo(name, phone, rent)
            binding.tenantResultTextView.text = tenant.summary()
        }
    }
}