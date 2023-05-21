package com.faendir.awscdkkt.services.fms

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.fms.CfnPolicy

@Generated
public
    fun networkFirewallPolicyProperty(initializer: CfnPolicy.NetworkFirewallPolicyProperty.Builder.() -> Unit
    = {}): CfnPolicy.NetworkFirewallPolicyProperty =
    CfnPolicy.NetworkFirewallPolicyProperty.builder().apply(initializer).build()
