package com.faendir.awscdkkt.services.globalaccelerator

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.globalaccelerator.EndpointGroupProps

@Generated
public fun endpointGroupProps(initializer: EndpointGroupProps.Builder.() -> Unit = {}):
    EndpointGroupProps = EndpointGroupProps.builder().apply(initializer).build()
