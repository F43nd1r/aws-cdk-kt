@file:Generated(value = ["Generated 2023-05-20 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.route53recoverycontrol

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.route53recoverycontrol.CfnSafetyRule
import software.amazon.awscdk.services.route53recoverycontrol.CfnSafetyRuleProps
import software.constructs.Construct

public fun Construct.cfnSafetyRule(
  id: String,
  props: CfnSafetyRuleProps,
  initializer: CfnSafetyRule.() -> Unit = {},
): CfnSafetyRule = CfnSafetyRule(this, id, props).apply(initializer)
