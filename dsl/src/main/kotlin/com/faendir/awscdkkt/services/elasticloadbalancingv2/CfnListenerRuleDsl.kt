@file:Generated(value = ["Generated based on CDK v2.80.0"])

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
