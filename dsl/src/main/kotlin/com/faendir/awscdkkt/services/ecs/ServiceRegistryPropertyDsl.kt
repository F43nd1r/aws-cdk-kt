@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.ecs

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ecs.CfnTaskSet

public
    fun serviceRegistryProperty(initializer: CfnTaskSet.ServiceRegistryProperty.Builder.() -> Unit):
    CfnTaskSet.ServiceRegistryProperty =
    CfnTaskSet.ServiceRegistryProperty.builder().apply(initializer).build()
