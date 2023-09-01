package com.faendir.awscdkkt.generated.services.billingconductor

import com.faendir.awscdkkt.AwsCdkDsl
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
  initializer: @AwsCdkDsl CfnPricingRule.() -> Unit = {},
): CfnPricingRule = CfnPricingRule(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnPricingRule(id: String, initializer: @AwsCdkDsl
    CfnPricingRule.Builder.() -> Unit = {}): CfnPricingRule = CfnPricingRule.Builder.create(this,
    id).apply(initializer).build()
