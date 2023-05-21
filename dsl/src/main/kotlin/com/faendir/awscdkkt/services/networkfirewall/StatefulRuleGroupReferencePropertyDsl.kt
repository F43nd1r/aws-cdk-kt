package com.faendir.awscdkkt.services.networkfirewall

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.networkfirewall.CfnFirewallPolicy

@Generated
public
    fun statefulRuleGroupReferenceProperty(initializer: CfnFirewallPolicy.StatefulRuleGroupReferenceProperty.Builder.() -> Unit
    = {}): CfnFirewallPolicy.StatefulRuleGroupReferenceProperty =
    CfnFirewallPolicy.StatefulRuleGroupReferenceProperty.builder().apply(initializer).build()
