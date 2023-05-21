package com.faendir.awscdkkt.services.rds

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.rds.ParameterGroupClusterConfig

@Generated
public fun parameterGroupClusterConfig(initializer: ParameterGroupClusterConfig.Builder.() -> Unit =
    {}): ParameterGroupClusterConfig =
    ParameterGroupClusterConfig.builder().apply(initializer).build()
