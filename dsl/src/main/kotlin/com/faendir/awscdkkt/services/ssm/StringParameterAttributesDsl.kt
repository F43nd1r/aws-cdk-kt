package com.faendir.awscdkkt.services.ssm

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ssm.StringParameterAttributes

@Generated
public fun stringParameterAttributes(initializer: StringParameterAttributes.Builder.() -> Unit =
    {}): StringParameterAttributes = StringParameterAttributes.builder().apply(initializer).build()
