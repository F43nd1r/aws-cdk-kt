package com.faendir.awscdkkt.services.globalaccelerator

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.globalaccelerator.RawEndpointProps

@Generated
public fun rawEndpointProps(initializer: RawEndpointProps.Builder.() -> Unit = {}): RawEndpointProps
    = RawEndpointProps.builder().apply(initializer).build()
