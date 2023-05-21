package com.faendir.awscdkkt.services.ses

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ses.CfnReceiptRule

@Generated
public fun bounceActionProperty(initializer: CfnReceiptRule.BounceActionProperty.Builder.() -> Unit
    = {}): CfnReceiptRule.BounceActionProperty =
    CfnReceiptRule.BounceActionProperty.builder().apply(initializer).build()
