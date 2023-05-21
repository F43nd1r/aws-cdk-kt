package com.faendir.awscdkkt.services.networkfirewall

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.networkfirewall.CfnFirewallPolicy

@Generated
public
    fun statelessRuleGroupReferenceProperty(initializer: CfnFirewallPolicy.StatelessRuleGroupReferenceProperty.Builder.() -> Unit
    = {}): CfnFirewallPolicy.StatelessRuleGroupReferenceProperty =
    CfnFirewallPolicy.StatelessRuleGroupReferenceProperty.builder().apply(initializer).build()
