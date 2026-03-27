package com.faendir.awscdkkt.generated.services.route53globalresolver

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.route53globalresolver.CfnFirewallRule
import software.amazon.awscdk.services.route53globalresolver.CfnFirewallRuleProps
import software.constructs.Construct

@Generated
public fun Construct.cfnFirewallRule(
  id: String,
  props: CfnFirewallRuleProps,
  initializer: @AwsCdkDsl CfnFirewallRule.() -> Unit = {},
): CfnFirewallRule = CfnFirewallRule(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnFirewallRule(id: String, initializer: @AwsCdkDsl CfnFirewallRule.Builder.() -> Unit = {}): CfnFirewallRule = CfnFirewallRule.Builder.create(this, id).apply(initializer).build()
