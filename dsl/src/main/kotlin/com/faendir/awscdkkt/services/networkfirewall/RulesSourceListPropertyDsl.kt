package com.faendir.awscdkkt.services.networkfirewall

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.networkfirewall.CfnRuleGroup

@Generated
public
    fun rulesSourceListProperty(initializer: CfnRuleGroup.RulesSourceListProperty.Builder.() -> Unit
    = {}): CfnRuleGroup.RulesSourceListProperty =
    CfnRuleGroup.RulesSourceListProperty.builder().apply(initializer).build()
