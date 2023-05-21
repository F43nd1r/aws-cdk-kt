package com.faendir.awscdkkt.services.ses

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ses.ReceiptRuleProps

@Generated
public fun receiptRuleProps(initializer: ReceiptRuleProps.Builder.() -> Unit = {}): ReceiptRuleProps
    = ReceiptRuleProps.builder().apply(initializer).build()
