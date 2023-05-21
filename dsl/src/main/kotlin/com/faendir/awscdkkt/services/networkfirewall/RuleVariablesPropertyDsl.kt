package com.faendir.awscdkkt.services.networkfirewall

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.networkfirewall.CfnRuleGroup

@Generated
public fun ruleVariablesProperty(initializer: CfnRuleGroup.RuleVariablesProperty.Builder.() -> Unit
    = {}): CfnRuleGroup.RuleVariablesProperty =
    CfnRuleGroup.RuleVariablesProperty.builder().apply(initializer).build()
