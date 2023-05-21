package com.faendir.awscdkkt.services.ses

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ses.CfnReceiptRule

@Generated
public fun ruleProperty(initializer: CfnReceiptRule.RuleProperty.Builder.() -> Unit = {}):
    CfnReceiptRule.RuleProperty = CfnReceiptRule.RuleProperty.builder().apply(initializer).build()
