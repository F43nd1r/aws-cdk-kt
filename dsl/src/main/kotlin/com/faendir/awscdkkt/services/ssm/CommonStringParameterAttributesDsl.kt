@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.ssm

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ssm.CommonStringParameterAttributes

public
    fun commonStringParameterAttributes(initializer: CommonStringParameterAttributes.Builder.() -> Unit):
    CommonStringParameterAttributes =
    CommonStringParameterAttributes.builder().apply(initializer).build()
