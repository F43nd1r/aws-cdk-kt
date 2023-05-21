package com.faendir.awscdkkt.services.fms

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.fms.CfnPolicy

@Generated
public
    fun thirdPartyFirewallPolicyProperty(initializer: CfnPolicy.ThirdPartyFirewallPolicyProperty.Builder.() -> Unit
    = {}): CfnPolicy.ThirdPartyFirewallPolicyProperty =
    CfnPolicy.ThirdPartyFirewallPolicyProperty.builder().apply(initializer).build()
