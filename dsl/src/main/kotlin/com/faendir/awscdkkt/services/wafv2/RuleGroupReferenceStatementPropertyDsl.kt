package com.faendir.awscdkkt.services.wafv2

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.wafv2.CfnWebACL

@Generated
public
    fun ruleGroupReferenceStatementProperty(initializer: CfnWebACL.RuleGroupReferenceStatementProperty.Builder.() -> Unit
    = {}): CfnWebACL.RuleGroupReferenceStatementProperty =
    CfnWebACL.RuleGroupReferenceStatementProperty.builder().apply(initializer).build()
