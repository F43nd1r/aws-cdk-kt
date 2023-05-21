package com.faendir.awscdkkt.services.ses

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ses.CfnReceiptRule

@Generated
public
    fun workmailActionProperty(initializer: CfnReceiptRule.WorkmailActionProperty.Builder.() -> Unit
    = {}): CfnReceiptRule.WorkmailActionProperty =
    CfnReceiptRule.WorkmailActionProperty.builder().apply(initializer).build()
