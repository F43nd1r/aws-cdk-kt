package com.faendir.awscdkkt.generated.services.waf.regional

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.waf.regional.CfnRateBasedRule
import software.amazon.awscdk.services.waf.regional.CfnRateBasedRuleProps
import software.constructs.Construct

@Generated
public fun Construct.cfnRateBasedRule(
  id: String,
  props: CfnRateBasedRuleProps,
  initializer: @AwsCdkDsl CfnRateBasedRule.() -> Unit = {},
): CfnRateBasedRule = CfnRateBasedRule(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnRateBasedRule(id: String, initializer: @AwsCdkDsl CfnRateBasedRule.Builder.() -> Unit = {}): CfnRateBasedRule = CfnRateBasedRule.Builder.create(this, id).apply(initializer).build()
