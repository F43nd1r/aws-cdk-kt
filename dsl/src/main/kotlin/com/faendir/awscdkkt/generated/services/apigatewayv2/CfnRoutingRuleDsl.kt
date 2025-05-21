package com.faendir.awscdkkt.generated.services.apigatewayv2

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.apigatewayv2.CfnRoutingRule
import software.amazon.awscdk.services.apigatewayv2.CfnRoutingRuleProps
import software.constructs.Construct

@Generated
public fun Construct.cfnRoutingRule(
  id: String,
  props: CfnRoutingRuleProps,
  initializer: @AwsCdkDsl CfnRoutingRule.() -> Unit = {},
): CfnRoutingRule = CfnRoutingRule(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnRoutingRule(id: String, initializer: @AwsCdkDsl
    CfnRoutingRule.Builder.() -> Unit = {}): CfnRoutingRule = CfnRoutingRule.Builder.create(this,
    id).apply(initializer).build()
