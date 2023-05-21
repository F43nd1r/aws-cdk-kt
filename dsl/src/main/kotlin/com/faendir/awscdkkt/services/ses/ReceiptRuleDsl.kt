package com.faendir.awscdkkt.services.ses

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.ses.ReceiptRule
import software.amazon.awscdk.services.ses.ReceiptRuleProps
import software.constructs.Construct

@Generated
public fun Construct.receiptRule(
  id: String,
  props: ReceiptRuleProps,
  initializer: ReceiptRule.() -> Unit = {},
): ReceiptRule = ReceiptRule(this, id, props).apply(initializer)
