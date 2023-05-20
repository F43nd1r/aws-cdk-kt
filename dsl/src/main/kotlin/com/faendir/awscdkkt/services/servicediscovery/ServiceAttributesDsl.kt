@file:Generated(value = ["Generated 2023-05-20 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.servicediscovery

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.servicediscovery.ServiceAttributes

public fun serviceAttributes(initializer: ServiceAttributes.Builder.() -> Unit): ServiceAttributes =
    ServiceAttributes.builder().apply(initializer).build()
