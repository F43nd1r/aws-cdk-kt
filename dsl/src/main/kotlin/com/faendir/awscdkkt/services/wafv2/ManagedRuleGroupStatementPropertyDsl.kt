package com.faendir.awscdkkt.services.wafv2

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.wafv2.CfnWebACL

@Generated
public
    fun managedRuleGroupStatementProperty(initializer: CfnWebACL.ManagedRuleGroupStatementProperty.Builder.() -> Unit
    = {}): CfnWebACL.ManagedRuleGroupStatementProperty =
    CfnWebACL.ManagedRuleGroupStatementProperty.builder().apply(initializer).build()
