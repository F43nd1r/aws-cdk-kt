package com.faendir.awscdkkt.generated.services.ses

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.ses.ReceiptRuleSet
import software.amazon.awscdk.services.ses.ReceiptRuleSetProps
import software.constructs.Construct

@Generated
public fun Construct.receiptRuleSet(id: String): ReceiptRuleSet = ReceiptRuleSet(this, id)

@Generated
public fun Construct.receiptRuleSet(id: String, initializer: @AwsCdkDsl ReceiptRuleSet.() -> Unit):
    ReceiptRuleSet = ReceiptRuleSet(this, id).apply(initializer)

@Generated
public fun Construct.receiptRuleSet(id: String, props: ReceiptRuleSetProps): ReceiptRuleSet =
    ReceiptRuleSet(this, id, props)

@Generated
public fun Construct.receiptRuleSet(
  id: String,
  props: ReceiptRuleSetProps,
  initializer: @AwsCdkDsl ReceiptRuleSet.() -> Unit,
): ReceiptRuleSet = ReceiptRuleSet(this, id, props).apply(initializer)

@Generated
public fun Construct.buildReceiptRuleSet(id: String, initializer: @AwsCdkDsl
    ReceiptRuleSet.Builder.() -> Unit): ReceiptRuleSet = ReceiptRuleSet.Builder.create(this,
    id).apply(initializer).build()
