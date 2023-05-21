package com.faendir.awscdkkt.services.networkfirewall

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.networkfirewall.CfnRuleGroup

@Generated
public
    fun actionDefinitionProperty(initializer: CfnRuleGroup.ActionDefinitionProperty.Builder.() -> Unit
    = {}): CfnRuleGroup.ActionDefinitionProperty =
    CfnRuleGroup.ActionDefinitionProperty.builder().apply(initializer).build()
