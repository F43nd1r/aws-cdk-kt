@file:Generated(value = ["Generated 2023-05-20 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.ssm

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ssm.SecureStringParameterAttributes

public
    fun secureStringParameterAttributes(initializer: SecureStringParameterAttributes.Builder.() -> Unit):
    SecureStringParameterAttributes =
    SecureStringParameterAttributes.builder().apply(initializer).build()
