package com.example.a1634201903271905024191606189796189579_tenantmanagementlab2

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import com.example.a1634201903271905024191606189796189579_tenantmanagementlab2.databinding.ActivityMainBinding

class MainActivity : ComponentActivity() {

    private lateinit var binding: ActivityMainBinding
    private var lastTenant: TenantInfo? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val email = intent.getStringExtra("EMAIL")
        if (email != null) {
            Toast.makeText(this, "Logged in as $email", Toast.LENGTH_SHORT).show()
        }

        binding.saveButton.setOnClickListener {
            val name = binding.tenantNameEditText.text.toString()
            val phone = binding.phoneEditText.text.toString()
            val rent = binding.rentEditText.text.toString()

            val tenant = TenantInfo(name, phone, rent)
            binding.tenantResultTextView.text = tenant.summary()
            lastTenant = tenant
        }

        binding.callButton.setOnClickListener {
            val tenant = lastTenant
            if (tenant == null) {
                Toast.makeText(this, "Save a tenant first", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }

            val intent = Intent(Intent.ACTION_DIAL, Uri.parse("tel:${tenant.phone}"))
            startActivity(intent)
        }
    }
}