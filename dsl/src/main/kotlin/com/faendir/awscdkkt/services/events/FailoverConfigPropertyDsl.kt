package com.faendir.awscdkkt.services.events

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.events.CfnEndpoint

@Generated
public fun failoverConfigProperty(initializer: CfnEndpoint.FailoverConfigProperty.Builder.() -> Unit
    = {}): CfnEndpoint.FailoverConfigProperty =
    CfnEndpoint.FailoverConfigProperty.builder().apply(initializer).build()
