package com.faendir.awscdkkt.services.ses

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.ses.DropSpamReceiptRule
import software.amazon.awscdk.services.ses.DropSpamReceiptRuleProps
import software.constructs.Construct

@Generated
public fun Construct.dropSpamReceiptRule(
  id: String,
  props: DropSpamReceiptRuleProps,
  initializer: DropSpamReceiptRule.() -> Unit = {},
): DropSpamReceiptRule = DropSpamReceiptRule(this, id, props).apply(initializer)
