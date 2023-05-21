package com.faendir.awscdkkt.services.batch

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.batch.CfnJobDefinition

@Generated
public fun volumesHostProperty(initializer: CfnJobDefinition.VolumesHostProperty.Builder.() -> Unit
    = {}): CfnJobDefinition.VolumesHostProperty =
    CfnJobDefinition.VolumesHostProperty.builder().apply(initializer).build()
