package com.faendir.awscdkkt.services.ssm

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ssm.ListParameterAttributes

@Generated
public fun listParameterAttributes(initializer: ListParameterAttributes.Builder.() -> Unit = {}):
    ListParameterAttributes = ListParameterAttributes.builder().apply(initializer).build()
