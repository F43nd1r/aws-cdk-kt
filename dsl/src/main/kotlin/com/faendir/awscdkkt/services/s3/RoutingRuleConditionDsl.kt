package com.faendir.awscdkkt.services.s3

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.s3.RoutingRuleCondition

@Generated
public fun routingRuleCondition(initializer: RoutingRuleCondition.Builder.() -> Unit = {}):
    RoutingRuleCondition = RoutingRuleCondition.builder().apply(initializer).build()
