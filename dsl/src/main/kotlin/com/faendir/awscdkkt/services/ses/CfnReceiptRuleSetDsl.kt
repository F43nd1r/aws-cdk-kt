package com.faendir.awscdkkt.services.ses

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.ses.CfnReceiptRuleSet
import software.amazon.awscdk.services.ses.CfnReceiptRuleSetProps
import software.constructs.Construct

@Generated
public fun Construct.cfnReceiptRuleSet(id: String, initializer: CfnReceiptRuleSet.() -> Unit = {}):
    CfnReceiptRuleSet = CfnReceiptRuleSet(this, id).apply(initializer)

@Generated
public fun Construct.cfnReceiptRuleSet(
  id: String,
  props: CfnReceiptRuleSetProps,
  initializer: CfnReceiptRuleSet.() -> Unit = {},
): CfnReceiptRuleSet = CfnReceiptRuleSet(this, id, props).apply(initializer)
