package com.faendir.awscdkkt.generated.services.ses

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.ses.CfnReceiptRule
import software.amazon.awscdk.services.ses.CfnReceiptRuleProps
import software.constructs.Construct

@Generated
public fun Construct.cfnReceiptRule(
  id: String,
  props: CfnReceiptRuleProps,
  initializer: @AwsCdkDsl CfnReceiptRule.() -> Unit = {},
): CfnReceiptRule = CfnReceiptRule(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnReceiptRule(id: String, initializer: @AwsCdkDsl
    CfnReceiptRule.Builder.() -> Unit = {}): CfnReceiptRule = CfnReceiptRule.Builder.create(this,
    id).apply(initializer).build()
