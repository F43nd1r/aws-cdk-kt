package com.faendir.awscdkkt.services.route53resolver

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.route53resolver.CfnFirewallRuleGroup

@Generated
public
    fun firewallRuleProperty(initializer: CfnFirewallRuleGroup.FirewallRuleProperty.Builder.() -> Unit
    = {}): CfnFirewallRuleGroup.FirewallRuleProperty =
    CfnFirewallRuleGroup.FirewallRuleProperty.builder().apply(initializer).build()
