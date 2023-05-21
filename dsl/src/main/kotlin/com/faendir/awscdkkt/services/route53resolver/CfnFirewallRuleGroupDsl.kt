package com.faendir.awscdkkt.services.route53resolver

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.route53resolver.CfnFirewallRuleGroup
import software.amazon.awscdk.services.route53resolver.CfnFirewallRuleGroupProps
import software.constructs.Construct

@Generated
public fun Construct.cfnFirewallRuleGroup(id: String, initializer: CfnFirewallRuleGroup.() -> Unit =
    {}): CfnFirewallRuleGroup = CfnFirewallRuleGroup(this, id).apply(initializer)

@Generated
public fun Construct.cfnFirewallRuleGroup(
  id: String,
  props: CfnFirewallRuleGroupProps,
  initializer: CfnFirewallRuleGroup.() -> Unit = {},
): CfnFirewallRuleGroup = CfnFirewallRuleGroup(this, id, props).apply(initializer)
