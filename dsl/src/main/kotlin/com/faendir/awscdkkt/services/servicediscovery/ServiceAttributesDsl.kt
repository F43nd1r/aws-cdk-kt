@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.servicediscovery

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.servicediscovery.ServiceAttributes

public fun serviceAttributes(initializer: ServiceAttributes.Builder.() -> Unit): ServiceAttributes =
    ServiceAttributes.builder().apply(initializer).build()
