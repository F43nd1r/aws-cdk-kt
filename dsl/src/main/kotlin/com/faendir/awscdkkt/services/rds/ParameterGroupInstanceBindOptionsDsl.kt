package com.faendir.awscdkkt.services.rds

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.rds.ParameterGroupInstanceBindOptions

@Generated
public
    fun parameterGroupInstanceBindOptions(initializer: ParameterGroupInstanceBindOptions.Builder.() -> Unit
    = {}): ParameterGroupInstanceBindOptions =
    ParameterGroupInstanceBindOptions.builder().apply(initializer).build()
