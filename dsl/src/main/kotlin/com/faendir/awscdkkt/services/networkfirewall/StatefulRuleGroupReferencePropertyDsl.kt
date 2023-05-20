@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.networkfirewall

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.networkfirewall.CfnFirewallPolicy

public
    fun statefulRuleGroupReferenceProperty(initializer: CfnFirewallPolicy.StatefulRuleGroupReferenceProperty.Builder.() -> Unit):
    CfnFirewallPolicy.StatefulRuleGroupReferenceProperty =
    CfnFirewallPolicy.StatefulRuleGroupReferenceProperty.builder().apply(initializer).build()
