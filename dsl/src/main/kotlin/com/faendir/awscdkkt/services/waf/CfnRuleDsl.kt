@file:Generated(value = ["Generated 2023-05-19 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.waf

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.waf.CfnRule
import software.amazon.awscdk.services.waf.CfnRuleProps
import software.constructs.Construct

public fun Construct.cfnRule(
  id: String,
  props: CfnRuleProps,
  initializer: CfnRule.() -> Unit = {},
): CfnRule = CfnRule(this, id, props).apply(initializer)
