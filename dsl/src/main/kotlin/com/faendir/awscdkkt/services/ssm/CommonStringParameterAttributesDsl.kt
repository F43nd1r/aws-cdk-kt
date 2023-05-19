@file:Generated(value = ["Generated 2023-05-19 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.ssm

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ssm.CommonStringParameterAttributes

public
    fun commonStringParameterAttributes(initializer: CommonStringParameterAttributes.Builder.() -> Unit):
    CommonStringParameterAttributes =
    CommonStringParameterAttributes.builder().apply(initializer).build()
