@file:Generated(value = ["Generated 2023-05-19 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.elasticloadbalancingv2

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.elasticloadbalancingv2.CfnListenerRule
import software.amazon.awscdk.services.elasticloadbalancingv2.CfnListenerRuleProps
import software.constructs.Construct

public fun Construct.cfnListenerRule(
  id: String,
  props: CfnListenerRuleProps,
  initializer: CfnListenerRule.() -> Unit = {},
): CfnListenerRule = CfnListenerRule(this, id, props).apply(initializer)
