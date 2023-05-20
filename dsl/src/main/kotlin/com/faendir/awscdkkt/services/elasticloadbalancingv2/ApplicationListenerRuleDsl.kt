@file:Generated(value = ["Generated 2023-05-20 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.elasticloadbalancingv2

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.elasticloadbalancingv2.ApplicationListenerRule
import software.amazon.awscdk.services.elasticloadbalancingv2.ApplicationListenerRuleProps
import software.constructs.Construct

public fun Construct.applicationListenerRule(
  id: String,
  props: ApplicationListenerRuleProps,
  initializer: ApplicationListenerRule.() -> Unit = {},
): ApplicationListenerRule = ApplicationListenerRule(this, id, props).apply(initializer)
