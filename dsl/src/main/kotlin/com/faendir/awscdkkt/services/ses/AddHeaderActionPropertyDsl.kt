package com.faendir.awscdkkt.services.ses

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ses.CfnReceiptRule

@Generated
public
    fun addHeaderActionProperty(initializer: CfnReceiptRule.AddHeaderActionProperty.Builder.() -> Unit
    = {}): CfnReceiptRule.AddHeaderActionProperty =
    CfnReceiptRule.AddHeaderActionProperty.builder().apply(initializer).build()
