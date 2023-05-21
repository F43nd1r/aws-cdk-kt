package com.faendir.awscdkkt.services.batch

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.batch.CfnJobDefinition

@Generated
public fun ulimitProperty(initializer: CfnJobDefinition.UlimitProperty.Builder.() -> Unit = {}):
    CfnJobDefinition.UlimitProperty =
    CfnJobDefinition.UlimitProperty.builder().apply(initializer).build()
