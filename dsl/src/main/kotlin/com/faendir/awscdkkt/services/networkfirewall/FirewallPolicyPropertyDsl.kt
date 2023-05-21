package com.faendir.awscdkkt.services.networkfirewall

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.networkfirewall.CfnFirewallPolicy

@Generated
public
    fun firewallPolicyProperty(initializer: CfnFirewallPolicy.FirewallPolicyProperty.Builder.() -> Unit
    = {}): CfnFirewallPolicy.FirewallPolicyProperty =
    CfnFirewallPolicy.FirewallPolicyProperty.builder().apply(initializer).build()
