package com.faendir.awscdkkt.services.servicediscovery

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.servicediscovery.ServiceProps

@Generated
public fun serviceProps(initializer: ServiceProps.Builder.() -> Unit = {}): ServiceProps =
    ServiceProps.builder().apply(initializer).build()
