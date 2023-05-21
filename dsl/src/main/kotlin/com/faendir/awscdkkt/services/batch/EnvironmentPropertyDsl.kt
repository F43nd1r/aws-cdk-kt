package com.faendir.awscdkkt.services.batch

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.batch.CfnJobDefinition

@Generated
public fun environmentProperty(initializer: CfnJobDefinition.EnvironmentProperty.Builder.() -> Unit
    = {}): CfnJobDefinition.EnvironmentProperty =
    CfnJobDefinition.EnvironmentProperty.builder().apply(initializer).build()
