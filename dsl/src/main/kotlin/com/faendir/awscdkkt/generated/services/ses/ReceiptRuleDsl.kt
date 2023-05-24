package com.faendir.awscdkkt.generated.services.ses

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.ses.ReceiptRule
import software.amazon.awscdk.services.ses.ReceiptRuleProps
import software.constructs.Construct

@Generated
public fun Construct.receiptRule(id: String, props: ReceiptRuleProps): ReceiptRule =
    ReceiptRule(this, id, props)

@Generated
public fun Construct.receiptRule(
  id: String,
  props: ReceiptRuleProps,
  initializer: @AwsCdkDsl ReceiptRule.() -> Unit,
): ReceiptRule = ReceiptRule(this, id, props).apply(initializer)

@Generated
public fun Construct.buildReceiptRule(id: String, initializer: @AwsCdkDsl
    ReceiptRule.Builder.() -> Unit): ReceiptRule = ReceiptRule.Builder.create(this,
    id).apply(initializer).build()
