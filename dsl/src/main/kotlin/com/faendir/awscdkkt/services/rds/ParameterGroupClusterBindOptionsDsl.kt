package com.faendir.awscdkkt.services.rds

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.rds.ParameterGroupClusterBindOptions

@Generated
public
    fun parameterGroupClusterBindOptions(initializer: ParameterGroupClusterBindOptions.Builder.() -> Unit
    = {}): ParameterGroupClusterBindOptions =
    ParameterGroupClusterBindOptions.builder().apply(initializer).build()
