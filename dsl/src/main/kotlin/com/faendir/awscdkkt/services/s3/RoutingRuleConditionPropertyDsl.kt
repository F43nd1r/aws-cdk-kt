package com.faendir.awscdkkt.services.s3

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.s3.CfnBucket

@Generated
public
    fun routingRuleConditionProperty(initializer: CfnBucket.RoutingRuleConditionProperty.Builder.() -> Unit
    = {}): CfnBucket.RoutingRuleConditionProperty =
    CfnBucket.RoutingRuleConditionProperty.builder().apply(initializer).build()
