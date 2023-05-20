@file:Generated(value = ["Generated 2023-05-20 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.globalaccelerator

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.globalaccelerator.EndpointGroupOptions

public fun endpointGroupOptions(initializer: EndpointGroupOptions.Builder.() -> Unit):
    EndpointGroupOptions = EndpointGroupOptions.builder().apply(initializer).build()
