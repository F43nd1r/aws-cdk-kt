package com.faendir.awscdkkt.services.ecs

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ecs.CfnTaskDefinition

@Generated
public fun hostEntryProperty(initializer: CfnTaskDefinition.HostEntryProperty.Builder.() -> Unit =
    {}): CfnTaskDefinition.HostEntryProperty =
    CfnTaskDefinition.HostEntryProperty.builder().apply(initializer).build()
