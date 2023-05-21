package com.faendir.awscdkkt.services.ecs

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ecs.CfnTaskDefinition

@Generated
public fun mountPointProperty(initializer: CfnTaskDefinition.MountPointProperty.Builder.() -> Unit =
    {}): CfnTaskDefinition.MountPointProperty =
    CfnTaskDefinition.MountPointProperty.builder().apply(initializer).build()
