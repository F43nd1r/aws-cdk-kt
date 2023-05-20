@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.connect

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.connect.CfnRule
import software.amazon.awscdk.services.connect.CfnRuleProps
import software.constructs.Construct

public fun Construct.cfnRule(
  id: String,
  props: CfnRuleProps,
  initializer: CfnRule.() -> Unit = {},
): CfnRule = CfnRule(this, id, props).apply(initializer)
