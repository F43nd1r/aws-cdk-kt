@file:Generated(value = ["Generated 2023-05-20 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.networkfirewall

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.networkfirewall.CfnRuleGroup

public fun rulesSourceProperty(initializer: CfnRuleGroup.RulesSourceProperty.Builder.() -> Unit):
    CfnRuleGroup.RulesSourceProperty =
    CfnRuleGroup.RulesSourceProperty.builder().apply(initializer).build()
