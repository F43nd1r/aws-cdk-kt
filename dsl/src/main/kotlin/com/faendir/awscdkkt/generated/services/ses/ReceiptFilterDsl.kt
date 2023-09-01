package com.faendir.awscdkkt.generated.services.ses

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.ses.ReceiptFilter
import software.amazon.awscdk.services.ses.ReceiptFilterProps
import software.constructs.Construct

@Generated
public fun Construct.receiptFilter(id: String, initializer: @AwsCdkDsl ReceiptFilter.() -> Unit =
    {}): ReceiptFilter = ReceiptFilter(this, id).apply(initializer)

@Generated
public fun Construct.receiptFilter(
  id: String,
  props: ReceiptFilterProps,
  initializer: @AwsCdkDsl ReceiptFilter.() -> Unit = {},
): ReceiptFilter = ReceiptFilter(this, id, props).apply(initializer)

@Generated
public fun Construct.buildReceiptFilter(id: String, initializer: @AwsCdkDsl
    ReceiptFilter.Builder.() -> Unit = {}): ReceiptFilter = ReceiptFilter.Builder.create(this,
    id).apply(initializer).build()
