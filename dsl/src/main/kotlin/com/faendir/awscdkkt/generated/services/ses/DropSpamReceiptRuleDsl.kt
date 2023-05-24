package com.faendir.awscdkkt.generated.services.ses

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.ses.DropSpamReceiptRule
import software.amazon.awscdk.services.ses.DropSpamReceiptRuleProps
import software.constructs.Construct

@Generated
public fun Construct.dropSpamReceiptRule(id: String, props: DropSpamReceiptRuleProps):
    DropSpamReceiptRule = DropSpamReceiptRule(this, id, props)

@Generated
public fun Construct.dropSpamReceiptRule(
  id: String,
  props: DropSpamReceiptRuleProps,
  initializer: @AwsCdkDsl DropSpamReceiptRule.() -> Unit,
): DropSpamReceiptRule = DropSpamReceiptRule(this, id, props).apply(initializer)

@Generated
public fun Construct.buildDropSpamReceiptRule(id: String, initializer: @AwsCdkDsl
    DropSpamReceiptRule.Builder.() -> Unit): DropSpamReceiptRule =
    DropSpamReceiptRule.Builder.create(this, id).apply(initializer).build()
