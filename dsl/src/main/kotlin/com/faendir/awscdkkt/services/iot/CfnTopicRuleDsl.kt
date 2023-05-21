package com.faendir.awscdkkt.services.iot

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.iot.CfnTopicRule
import software.amazon.awscdk.services.iot.CfnTopicRuleProps
import software.constructs.Construct

@Generated
public fun Construct.cfnTopicRule(
  id: String,
  props: CfnTopicRuleProps,
  initializer: CfnTopicRule.() -> Unit = {},
): CfnTopicRule = CfnTopicRule(this, id, props).apply(initializer)
