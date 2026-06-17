package com.faendir.awscdkkt.generated.services.rtbfabric

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.rtbfabric.CfnLinkRoutingRule
import software.amazon.awscdk.services.rtbfabric.CfnLinkRoutingRuleProps
import software.constructs.Construct

@Generated
public fun Construct.cfnLinkRoutingRule(
  id: String,
  props: CfnLinkRoutingRuleProps,
  initializer: @AwsCdkDsl CfnLinkRoutingRule.() -> Unit = {},
): CfnLinkRoutingRule = CfnLinkRoutingRule(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnLinkRoutingRule(id: String, initializer: @AwsCdkDsl CfnLinkRoutingRule.Builder.() -> Unit = {}): CfnLinkRoutingRule = CfnLinkRoutingRule.Builder.create(this, id).apply(initializer).build()
