package com.faendir.awscdkkt.services.ses

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ses.ReceiptRuleOptions

@Generated
public fun receiptRuleOptions(initializer: ReceiptRuleOptions.Builder.() -> Unit = {}):
    ReceiptRuleOptions = ReceiptRuleOptions.builder().apply(initializer).build()
