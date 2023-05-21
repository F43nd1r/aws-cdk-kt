package com.faendir.awscdkkt.services.ses

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ses.CfnReceiptRule

@Generated
public fun stopActionProperty(initializer: CfnReceiptRule.StopActionProperty.Builder.() -> Unit =
    {}): CfnReceiptRule.StopActionProperty =
    CfnReceiptRule.StopActionProperty.builder().apply(initializer).build()
