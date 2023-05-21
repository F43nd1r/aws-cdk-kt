package com.faendir.awscdkkt

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.CfnRule
import software.amazon.awscdk.CfnRuleProps
import software.constructs.Construct

@Generated
public fun Construct.cfnRule(id: String, initializer: CfnRule.() -> Unit = {}): CfnRule =
    CfnRule(this, id).apply(initializer)

@Generated
public fun Construct.cfnRule(
  id: String,
  props: CfnRuleProps,
  initializer: CfnRule.() -> Unit = {},
): CfnRule = CfnRule(this, id, props).apply(initializer)
