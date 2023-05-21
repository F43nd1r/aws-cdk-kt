package com.faendir.awscdkkt.services.iot

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.iot.CfnTopicRuleDestination
import software.amazon.awscdk.services.iot.CfnTopicRuleDestinationProps
import software.constructs.Construct

@Generated
public fun Construct.cfnTopicRuleDestination(id: String,
    initializer: CfnTopicRuleDestination.() -> Unit = {}): CfnTopicRuleDestination =
    CfnTopicRuleDestination(this, id).apply(initializer)

@Generated
public fun Construct.cfnTopicRuleDestination(
  id: String,
  props: CfnTopicRuleDestinationProps,
  initializer: CfnTopicRuleDestination.() -> Unit = {},
): CfnTopicRuleDestination = CfnTopicRuleDestination(this, id, props).apply(initializer)
