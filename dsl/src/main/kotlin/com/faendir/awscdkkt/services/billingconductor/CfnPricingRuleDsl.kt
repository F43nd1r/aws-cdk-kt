package com.faendir.awscdkkt.services.billingconductor

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.billingconductor.CfnPricingRule
import software.amazon.awscdk.services.billingconductor.CfnPricingRuleProps
import software.constructs.Construct

@Generated
public fun Construct.cfnPricingRule(
  id: String,
  props: CfnPricingRuleProps,
  initializer: CfnPricingRule.() -> Unit = {},
): CfnPricingRule = CfnPricingRule(this, id, props).apply(initializer)
