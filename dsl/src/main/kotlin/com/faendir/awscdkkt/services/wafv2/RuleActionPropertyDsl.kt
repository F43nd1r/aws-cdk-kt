package com.faendir.awscdkkt.services.wafv2

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.wafv2.CfnWebACL

@Generated
public fun ruleActionProperty(initializer: CfnWebACL.RuleActionProperty.Builder.() -> Unit = {}):
    CfnWebACL.RuleActionProperty = CfnWebACL.RuleActionProperty.builder().apply(initializer).build()
