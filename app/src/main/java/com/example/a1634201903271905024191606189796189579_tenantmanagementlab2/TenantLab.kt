package com.example.a1634201903271905024191606189796189579_tenantmanagementlab2

class Tenant(
    val name: String,
    val apartmentNumber: Int,
    rentAmount: Double
) {

    var isPaid: Boolean = false

    var rentAmount: Double = rentAmount
        set(value) {
            if (value >= 0) {
                field = value
            } else {
                println("Rent amount cannot be negative.")
            }
        }
        get() {
            println("Rent amount accessed.")
            return field
        }

    init {
        require(rentAmount >= 0) {
            "Rent amount cannot be negative."
        }
    }

    fun payRent() {
        isPaid = true
        println("Rent paid successfully by $name")
    }
}


class Apartment(
    val apartmentNumber: Int
) {

    val tenants: MutableList<Tenant> = mutableListOf()

    fun addTenant(tenant: Tenant) {
        tenants.add(tenant)
    }

    fun showTenants(): String {

        val output = StringBuilder()

        output.append("Apartment: $apartmentNumber\n\n")

        for (tenant in tenants) {
            output.append("Tenant: ${tenant.name}\n")
            output.append("Apartment Number: ${tenant.apartmentNumber}\n")
            output.append("Rent: ${tenant.rentAmount}\n")
            output.append("Rent paid: ${tenant.isPaid}\n\n")
        }

        return output.toString()
    }
}


fun runTenantManagementLab(): String {

    val output = StringBuilder()

    val tenant1 = Tenant("Ahmed", 101, 15000.0)
    val tenant2 = Tenant("Aisha", 101, 18000.0)

    tenant1.payRent()

    output.append("${tenant1.name} paid rent: ${tenant1.isPaid}\n")
    output.append("${tenant2.name} paid rent: ${tenant2.isPaid}\n\n")

    tenant1.rentAmount = -5000.0

    output.append("Tenant 1 rent: ${tenant1.rentAmount}\n")
    output.append("Tenant 2 rent: ${tenant2.rentAmount}\n\n")

    val apartment = Apartment(101)

    apartment.addTenant(tenant1)
    apartment.addTenant(tenant2)

    output.append("Total tenants: ${apartment.tenants.size}\n\n")

    output.append(apartment.showTenants())

    return output.toString()
}