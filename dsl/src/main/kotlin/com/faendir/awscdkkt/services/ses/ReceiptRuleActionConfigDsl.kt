package com.faendir.awscdkkt.services.ses

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ses.ReceiptRuleActionConfig

@Generated
public fun receiptRuleActionConfig(initializer: ReceiptRuleActionConfig.Builder.() -> Unit = {}):
    ReceiptRuleActionConfig = ReceiptRuleActionConfig.builder().apply(initializer).build()
