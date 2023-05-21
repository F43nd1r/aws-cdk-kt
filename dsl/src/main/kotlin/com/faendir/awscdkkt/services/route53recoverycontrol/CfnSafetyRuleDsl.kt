package com.faendir.awscdkkt.services.route53recoverycontrol

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.route53recoverycontrol.CfnSafetyRule
import software.amazon.awscdk.services.route53recoverycontrol.CfnSafetyRuleProps
import software.constructs.Construct

@Generated
public fun Construct.cfnSafetyRule(
  id: String,
  props: CfnSafetyRuleProps,
  initializer: CfnSafetyRule.() -> Unit = {},
): CfnSafetyRule = CfnSafetyRule(this, id, props).apply(initializer)
