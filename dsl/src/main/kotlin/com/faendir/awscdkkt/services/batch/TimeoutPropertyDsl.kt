package com.faendir.awscdkkt.services.batch

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.batch.CfnJobDefinition

@Generated
public fun timeoutProperty(initializer: CfnJobDefinition.TimeoutProperty.Builder.() -> Unit = {}):
    CfnJobDefinition.TimeoutProperty =
    CfnJobDefinition.TimeoutProperty.builder().apply(initializer).build()
