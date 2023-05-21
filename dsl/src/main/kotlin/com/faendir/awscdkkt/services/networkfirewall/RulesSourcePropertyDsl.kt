package com.faendir.awscdkkt.services.networkfirewall

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.networkfirewall.CfnRuleGroup

@Generated
public fun rulesSourceProperty(initializer: CfnRuleGroup.RulesSourceProperty.Builder.() -> Unit =
    {}): CfnRuleGroup.RulesSourceProperty =
    CfnRuleGroup.RulesSourceProperty.builder().apply(initializer).build()
