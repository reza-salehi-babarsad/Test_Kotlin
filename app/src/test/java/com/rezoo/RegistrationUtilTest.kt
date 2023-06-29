package com.rezoo


import com.google.common.truth.Truth.assertThat
import org.junit.Test

class RegistrationUtilTest{

   @Test
    fun `empty username returns false`() {
        val result = RegistrationUtil.validateRegistrationInputs(
            "",
            "123",
            "123"
        )
        assertThat(result).isFalse()
    }
}