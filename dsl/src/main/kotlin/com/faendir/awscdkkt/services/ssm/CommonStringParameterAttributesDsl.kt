package com.faendir.awscdkkt.services.ssm

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ssm.CommonStringParameterAttributes

@Generated
public
    fun commonStringParameterAttributes(initializer: CommonStringParameterAttributes.Builder.() -> Unit
    = {}): CommonStringParameterAttributes =
    CommonStringParameterAttributes.builder().apply(initializer).build()
