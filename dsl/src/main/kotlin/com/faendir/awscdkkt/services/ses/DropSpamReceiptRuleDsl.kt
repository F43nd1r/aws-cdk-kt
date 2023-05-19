@file:Generated(value = ["Generated 2023-05-19 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.ses

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.ses.DropSpamReceiptRule
import software.amazon.awscdk.services.ses.DropSpamReceiptRuleProps
import software.constructs.Construct

public fun Construct.dropSpamReceiptRule(
  id: String,
  props: DropSpamReceiptRuleProps,
  initializer: DropSpamReceiptRule.() -> Unit = {},
): DropSpamReceiptRule = DropSpamReceiptRule(this, id, props).apply(initializer)
