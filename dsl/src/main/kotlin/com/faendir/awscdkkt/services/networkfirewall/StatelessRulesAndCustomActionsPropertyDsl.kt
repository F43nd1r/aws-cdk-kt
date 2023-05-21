package com.faendir.awscdkkt.services.networkfirewall

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.networkfirewall.CfnRuleGroup

@Generated
public
    fun statelessRulesAndCustomActionsProperty(initializer: CfnRuleGroup.StatelessRulesAndCustomActionsProperty.Builder.() -> Unit
    = {}): CfnRuleGroup.StatelessRulesAndCustomActionsProperty =
    CfnRuleGroup.StatelessRulesAndCustomActionsProperty.builder().apply(initializer).build()
