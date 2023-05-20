@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.networkfirewall

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.networkfirewall.CfnFirewallPolicy

public
    fun statefulRuleGroupOverrideProperty(initializer: CfnFirewallPolicy.StatefulRuleGroupOverrideProperty.Builder.() -> Unit):
    CfnFirewallPolicy.StatefulRuleGroupOverrideProperty =
    CfnFirewallPolicy.StatefulRuleGroupOverrideProperty.builder().apply(initializer).build()
