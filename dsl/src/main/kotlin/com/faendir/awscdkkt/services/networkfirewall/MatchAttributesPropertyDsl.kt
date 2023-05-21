package com.faendir.awscdkkt.services.networkfirewall

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.networkfirewall.CfnRuleGroup

@Generated
public
    fun matchAttributesProperty(initializer: CfnRuleGroup.MatchAttributesProperty.Builder.() -> Unit
    = {}): CfnRuleGroup.MatchAttributesProperty =
    CfnRuleGroup.MatchAttributesProperty.builder().apply(initializer).build()
