package com.faendir.awscdkkt.services.batch

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.batch.CfnJobDefinition

@Generated
public fun mountPointsProperty(initializer: CfnJobDefinition.MountPointsProperty.Builder.() -> Unit
    = {}): CfnJobDefinition.MountPointsProperty =
    CfnJobDefinition.MountPointsProperty.builder().apply(initializer).build()
