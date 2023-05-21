package com.faendir.awscdkkt.services.batch

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.batch.CfnJobDefinition

@Generated
public fun volumesProperty(initializer: CfnJobDefinition.VolumesProperty.Builder.() -> Unit = {}):
    CfnJobDefinition.VolumesProperty =
    CfnJobDefinition.VolumesProperty.builder().apply(initializer).build()
