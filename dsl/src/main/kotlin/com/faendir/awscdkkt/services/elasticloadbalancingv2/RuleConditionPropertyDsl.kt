package com.faendir.awscdkkt.services.elasticloadbalancingv2

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.elasticloadbalancingv2.CfnListenerRule

@Generated
public
    fun ruleConditionProperty(initializer: CfnListenerRule.RuleConditionProperty.Builder.() -> Unit
    = {}): CfnListenerRule.RuleConditionProperty =
    CfnListenerRule.RuleConditionProperty.builder().apply(initializer).build()
