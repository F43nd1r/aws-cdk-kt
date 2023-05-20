@file:Generated(value = ["Generated 2023-05-20 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.ses

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.ses.ReceiptRule
import software.amazon.awscdk.services.ses.ReceiptRuleProps
import software.constructs.Construct

public fun Construct.receiptRule(
  id: String,
  props: ReceiptRuleProps,
  initializer: ReceiptRule.() -> Unit = {},
): ReceiptRule = ReceiptRule(this, id, props).apply(initializer)
