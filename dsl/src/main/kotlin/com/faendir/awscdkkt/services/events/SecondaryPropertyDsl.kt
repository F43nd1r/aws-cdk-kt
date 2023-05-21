package com.faendir.awscdkkt.services.events

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.events.CfnEndpoint

@Generated
public fun secondaryProperty(initializer: CfnEndpoint.SecondaryProperty.Builder.() -> Unit = {}):
    CfnEndpoint.SecondaryProperty =
    CfnEndpoint.SecondaryProperty.builder().apply(initializer).build()
