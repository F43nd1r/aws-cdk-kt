@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.servicediscovery

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.servicediscovery.ServiceProps

public fun serviceProps(initializer: ServiceProps.Builder.() -> Unit): ServiceProps =
    ServiceProps.builder().apply(initializer).build()
