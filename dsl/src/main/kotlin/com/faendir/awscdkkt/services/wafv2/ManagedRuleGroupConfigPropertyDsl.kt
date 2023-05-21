package com.faendir.awscdkkt.services.wafv2

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.wafv2.CfnWebACL

@Generated
public
    fun managedRuleGroupConfigProperty(initializer: CfnWebACL.ManagedRuleGroupConfigProperty.Builder.() -> Unit
    = {}): CfnWebACL.ManagedRuleGroupConfigProperty =
    CfnWebACL.ManagedRuleGroupConfigProperty.builder().apply(initializer).build()
