package com.faendir.awscdkkt.services.ses

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ses.CfnReceiptRule

@Generated
public fun actionProperty(initializer: CfnReceiptRule.ActionProperty.Builder.() -> Unit = {}):
    CfnReceiptRule.ActionProperty =
    CfnReceiptRule.ActionProperty.builder().apply(initializer).build()
