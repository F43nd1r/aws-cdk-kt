package com.faendir.awscdkkt.services.rds

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.rds.ParameterGroupInstanceConfig

@Generated
public fun parameterGroupInstanceConfig(initializer: ParameterGroupInstanceConfig.Builder.() -> Unit
    = {}): ParameterGroupInstanceConfig =
    ParameterGroupInstanceConfig.builder().apply(initializer).build()
