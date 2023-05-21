package com.faendir.awscdkkt.services.rds

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.rds.ParameterGroupProps

@Generated
public fun parameterGroupProps(initializer: ParameterGroupProps.Builder.() -> Unit = {}):
    ParameterGroupProps = ParameterGroupProps.builder().apply(initializer).build()
