package com.example.fastestdelivery.utils.validate

import com.google.common.truth.Truth.assertThat
import org.junit.Test

class RegistrationValidateTest{

    @Test
    fun `result true`(){
        val result = RegistrationValidate().validateRegistration(
            "kkkjj@kkkk.gh",
            "fdffff",
            233,
            "ffdd"
        )
        assertThat(result).isTrue()
    }

    @Test
    fun `is empty result false`(){
        val result = RegistrationValidate().validateRegistration(
            "kkkjj@kkkk.gh",
            "",
            233,
            "ffdd"
        )
        assertThat(result).isFalse()
    }
}