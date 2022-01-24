package com.example.fastestdelivery.utils.validate

class RegistrationValidate {

    fun validateRegistration(
        email:String,
        password:String,
        phone:Int,
        name:String
    ):Boolean{

        if (email.isEmpty() || password.isEmpty() || phone.toString().isEmpty() || name.isEmpty())
            return false

        if (!email.any("." :: contains) || !email.any("@"::contains))
            return false

        return true
    }
}