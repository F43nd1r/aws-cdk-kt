package com.faendir.awscdkkt.services.ssm

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ssm.ParameterOptions

@Generated
public fun parameterOptions(initializer: ParameterOptions.Builder.() -> Unit = {}): ParameterOptions
    = ParameterOptions.builder().apply(initializer).build()
