package com.faendir.awscdkkt.services.batch

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.batch.CfnJobDefinition

@Generated
public
    fun eksContainerEnvironmentVariableProperty(initializer: CfnJobDefinition.EksContainerEnvironmentVariableProperty.Builder.() -> Unit
    = {}): CfnJobDefinition.EksContainerEnvironmentVariableProperty =
    CfnJobDefinition.EksContainerEnvironmentVariableProperty.builder().apply(initializer).build()
