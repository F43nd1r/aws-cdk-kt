@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.ses

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ses.CfnReceiptRule

public
    fun workmailActionProperty(initializer: CfnReceiptRule.WorkmailActionProperty.Builder.() -> Unit):
    CfnReceiptRule.WorkmailActionProperty =
    CfnReceiptRule.WorkmailActionProperty.builder().apply(initializer).build()
