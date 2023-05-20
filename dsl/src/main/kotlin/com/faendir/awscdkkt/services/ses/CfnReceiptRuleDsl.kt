@file:Generated(value = ["Generated 2023-05-20 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.ses

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.ses.CfnReceiptRule
import software.amazon.awscdk.services.ses.CfnReceiptRuleProps
import software.constructs.Construct

public fun Construct.cfnReceiptRule(
  id: String,
  props: CfnReceiptRuleProps,
  initializer: CfnReceiptRule.() -> Unit = {},
): CfnReceiptRule = CfnReceiptRule(this, id, props).apply(initializer)
