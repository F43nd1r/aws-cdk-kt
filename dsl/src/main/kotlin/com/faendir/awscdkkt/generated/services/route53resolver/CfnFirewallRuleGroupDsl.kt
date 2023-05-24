package com.faendir.awscdkkt.generated.services.route53resolver

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.route53resolver.CfnFirewallRuleGroup
import software.amazon.awscdk.services.route53resolver.CfnFirewallRuleGroupProps
import software.constructs.Construct

@Generated
public fun Construct.cfnFirewallRuleGroup(id: String): CfnFirewallRuleGroup =
    CfnFirewallRuleGroup(this, id)

@Generated
public fun Construct.cfnFirewallRuleGroup(id: String, initializer: @AwsCdkDsl
    CfnFirewallRuleGroup.() -> Unit): CfnFirewallRuleGroup = CfnFirewallRuleGroup(this,
    id).apply(initializer)

@Generated
public fun Construct.cfnFirewallRuleGroup(id: String, props: CfnFirewallRuleGroupProps):
    CfnFirewallRuleGroup = CfnFirewallRuleGroup(this, id, props)

@Generated
public fun Construct.cfnFirewallRuleGroup(
  id: String,
  props: CfnFirewallRuleGroupProps,
  initializer: @AwsCdkDsl CfnFirewallRuleGroup.() -> Unit,
): CfnFirewallRuleGroup = CfnFirewallRuleGroup(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnFirewallRuleGroup(id: String, initializer: @AwsCdkDsl
    CfnFirewallRuleGroup.Builder.() -> Unit): CfnFirewallRuleGroup =
    CfnFirewallRuleGroup.Builder.create(this, id).apply(initializer).build()
