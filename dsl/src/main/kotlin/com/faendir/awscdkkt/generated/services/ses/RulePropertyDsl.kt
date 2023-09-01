package com.faendir.awscdkkt.generated.services.ses

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ses.CfnReceiptRule

@Generated
public fun buildRuleProperty(initializer: @AwsCdkDsl CfnReceiptRule.RuleProperty.Builder.() -> Unit
    = {}): CfnReceiptRule.RuleProperty =
    CfnReceiptRule.RuleProperty.Builder().apply(initializer).build()
