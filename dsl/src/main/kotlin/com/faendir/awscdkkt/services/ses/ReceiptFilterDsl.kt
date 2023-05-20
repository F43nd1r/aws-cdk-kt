@file:Generated(value = ["Generated 2023-05-20 based on CDK 2.79.1"])

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
