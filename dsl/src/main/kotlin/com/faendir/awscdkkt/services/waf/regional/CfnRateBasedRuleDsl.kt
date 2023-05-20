@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.waf.regional

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.waf.regional.CfnRateBasedRule
import software.amazon.awscdk.services.waf.regional.CfnRateBasedRuleProps
import software.constructs.Construct

public fun Construct.cfnRateBasedRule(
  id: String,
  props: CfnRateBasedRuleProps,
  initializer: CfnRateBasedRule.() -> Unit = {},
): CfnRateBasedRule = CfnRateBasedRule(this, id, props).apply(initializer)
