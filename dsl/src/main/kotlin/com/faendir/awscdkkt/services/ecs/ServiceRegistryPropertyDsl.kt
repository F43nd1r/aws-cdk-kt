package com.faendir.awscdkkt.services.ecs

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ecs.CfnTaskSet

@Generated
public
    fun serviceRegistryProperty(initializer: CfnTaskSet.ServiceRegistryProperty.Builder.() -> Unit =
    {}): CfnTaskSet.ServiceRegistryProperty =
    CfnTaskSet.ServiceRegistryProperty.builder().apply(initializer).build()
