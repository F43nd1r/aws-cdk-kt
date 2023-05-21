package com.faendir.awscdkkt.services.ssm

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ssm.SecureStringParameterAttributes

@Generated
public
    fun secureStringParameterAttributes(initializer: SecureStringParameterAttributes.Builder.() -> Unit
    = {}): SecureStringParameterAttributes =
    SecureStringParameterAttributes.builder().apply(initializer).build()
