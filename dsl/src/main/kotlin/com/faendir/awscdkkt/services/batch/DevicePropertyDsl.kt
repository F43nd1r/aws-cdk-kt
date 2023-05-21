package com.faendir.awscdkkt.services.batch

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.batch.CfnJobDefinition

@Generated
public fun deviceProperty(initializer: CfnJobDefinition.DeviceProperty.Builder.() -> Unit = {}):
    CfnJobDefinition.DeviceProperty =
    CfnJobDefinition.DeviceProperty.builder().apply(initializer).build()
