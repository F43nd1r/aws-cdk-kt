package com.faendir.awscdkkt.services.networkfirewall

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.networkfirewall.CfnFirewallPolicy

@Generated
public
    fun policyVariablesProperty(initializer: CfnFirewallPolicy.PolicyVariablesProperty.Builder.() -> Unit
    = {}): CfnFirewallPolicy.PolicyVariablesProperty =
    CfnFirewallPolicy.PolicyVariablesProperty.builder().apply(initializer).build()
