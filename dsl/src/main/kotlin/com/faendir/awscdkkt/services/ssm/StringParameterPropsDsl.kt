package com.faendir.awscdkkt.services.ssm

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ssm.StringParameterProps

@Generated
public fun stringParameterProps(initializer: StringParameterProps.Builder.() -> Unit = {}):
    StringParameterProps = StringParameterProps.builder().apply(initializer).build()
