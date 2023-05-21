package com.faendir.awscdkkt.services.cloudformation

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.cloudformation.CfnStackSet

@Generated
public fun parameterProperty(initializer: CfnStackSet.ParameterProperty.Builder.() -> Unit = {}):
    CfnStackSet.ParameterProperty =
    CfnStackSet.ParameterProperty.builder().apply(initializer).build()
