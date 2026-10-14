package com.example.a1634201903271905024191606189796189579_tenantmanagementlab2

data class TenantInfo(
    val name: String,
    val phone: String,
    val rent: String
) {
    fun summary(): String {
        return "Tenant: $name\nPhone: $phone\nRent: KSh $rent"
    }
}