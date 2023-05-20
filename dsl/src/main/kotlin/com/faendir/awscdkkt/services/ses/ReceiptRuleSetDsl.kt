@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.ses

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.ses.ReceiptRuleSet
import software.amazon.awscdk.services.ses.ReceiptRuleSetProps
import software.constructs.Construct

public fun Construct.receiptRuleSet(id: String, initializer: ReceiptRuleSet.() -> Unit = {}):
    ReceiptRuleSet = ReceiptRuleSet(this, id).apply(initializer)

public fun Construct.receiptRuleSet(
  id: String,
  props: ReceiptRuleSetProps,
  initializer: ReceiptRuleSet.() -> Unit = {},
): ReceiptRuleSet = ReceiptRuleSet(this, id, props).apply(initializer)
