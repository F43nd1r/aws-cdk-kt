package com.faendir.awscdkkt.services.events

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.events.CfnEndpointProps

@Generated
public fun cfnEndpointProps(initializer: CfnEndpointProps.Builder.() -> Unit = {}): CfnEndpointProps
    = CfnEndpointProps.builder().apply(initializer).build()
