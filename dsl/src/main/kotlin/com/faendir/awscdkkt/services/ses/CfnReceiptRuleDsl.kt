@file:Generated(value = ["Generated based on CDK v2.80.0"])

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
