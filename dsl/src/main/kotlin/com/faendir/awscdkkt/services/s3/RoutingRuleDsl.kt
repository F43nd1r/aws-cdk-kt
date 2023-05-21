package com.faendir.awscdkkt.services.s3

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.s3.RoutingRule

@Generated
public fun routingRule(initializer: RoutingRule.Builder.() -> Unit = {}): RoutingRule =
    RoutingRule.builder().apply(initializer).build()
