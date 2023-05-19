@file:Generated(value = ["Generated 2023-05-19 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.networkfirewall

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.networkfirewall.CfnRuleGroup

public fun ruleGroupProperty(initializer: CfnRuleGroup.RuleGroupProperty.Builder.() -> Unit):
    CfnRuleGroup.RuleGroupProperty =
    CfnRuleGroup.RuleGroupProperty.builder().apply(initializer).build()
