package com.faendir.awscdkkt.services.greengrass

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.greengrass.CfnFunctionDefinitionVersion

@Generated
public
    fun executionProperty(initializer: CfnFunctionDefinitionVersion.ExecutionProperty.Builder.() -> Unit
    = {}): CfnFunctionDefinitionVersion.ExecutionProperty =
    CfnFunctionDefinitionVersion.ExecutionProperty.builder().apply(initializer).build()
