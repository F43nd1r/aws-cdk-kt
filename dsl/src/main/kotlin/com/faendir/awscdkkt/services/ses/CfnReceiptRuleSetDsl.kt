@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.ses

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.ses.CfnReceiptRuleSet
import software.amazon.awscdk.services.ses.CfnReceiptRuleSetProps
import software.constructs.Construct

public fun Construct.cfnReceiptRuleSet(id: String, initializer: CfnReceiptRuleSet.() -> Unit = {}):
    CfnReceiptRuleSet = CfnReceiptRuleSet(this, id).apply(initializer)

public fun Construct.cfnReceiptRuleSet(
  id: String,
  props: CfnReceiptRuleSetProps,
  initializer: CfnReceiptRuleSet.() -> Unit = {},
): CfnReceiptRuleSet = CfnReceiptRuleSet(this, id, props).apply(initializer)
