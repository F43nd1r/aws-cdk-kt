package com.faendir.awscdkkt.services.networkfirewall

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.networkfirewall.CfnRuleGroup

@Generated
public
    fun ruleDefinitionProperty(initializer: CfnRuleGroup.RuleDefinitionProperty.Builder.() -> Unit =
    {}): CfnRuleGroup.RuleDefinitionProperty =
    CfnRuleGroup.RuleDefinitionProperty.builder().apply(initializer).build()
