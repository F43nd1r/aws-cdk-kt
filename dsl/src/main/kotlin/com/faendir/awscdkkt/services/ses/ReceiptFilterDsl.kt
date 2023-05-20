@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.ses

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.ses.ReceiptFilter
import software.amazon.awscdk.services.ses.ReceiptFilterProps
import software.constructs.Construct

public fun Construct.receiptFilter(id: String, initializer: ReceiptFilter.() -> Unit = {}):
    ReceiptFilter = ReceiptFilter(this, id).apply(initializer)

public fun Construct.receiptFilter(
  id: String,
  props: ReceiptFilterProps,
  initializer: ReceiptFilter.() -> Unit = {},
): ReceiptFilter = ReceiptFilter(this, id, props).apply(initializer)
