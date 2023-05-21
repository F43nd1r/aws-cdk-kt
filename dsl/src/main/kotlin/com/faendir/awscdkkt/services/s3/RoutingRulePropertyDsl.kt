package com.faendir.awscdkkt.services.s3

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.s3.CfnBucket

@Generated
public fun routingRuleProperty(initializer: CfnBucket.RoutingRuleProperty.Builder.() -> Unit = {}):
    CfnBucket.RoutingRuleProperty =
    CfnBucket.RoutingRuleProperty.builder().apply(initializer).build()
