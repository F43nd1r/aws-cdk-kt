package com.faendir.awscdkkt.services.batch

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.batch.CfnJobDefinition

@Generated
public fun hostPathProperty(initializer: CfnJobDefinition.HostPathProperty.Builder.() -> Unit = {}):
    CfnJobDefinition.HostPathProperty =
    CfnJobDefinition.HostPathProperty.builder().apply(initializer).build()
