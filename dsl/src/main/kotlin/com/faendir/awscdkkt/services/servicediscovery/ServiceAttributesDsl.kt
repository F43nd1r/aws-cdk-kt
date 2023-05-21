package com.faendir.awscdkkt.services.servicediscovery

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.servicediscovery.ServiceAttributes

@Generated
public fun serviceAttributes(initializer: ServiceAttributes.Builder.() -> Unit = {}):
    ServiceAttributes = ServiceAttributes.builder().apply(initializer).build()
