@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.xray

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.xray.CfnSamplingRule
import software.amazon.awscdk.services.xray.CfnSamplingRuleProps
import software.constructs.Construct

public fun Construct.cfnSamplingRule(
  id: String,
  props: CfnSamplingRuleProps,
  initializer: CfnSamplingRule.() -> Unit = {},
): CfnSamplingRule = CfnSamplingRule(this, id, props).apply(initializer)

public fun Construct.cfnSamplingRule(id: String, initializer: CfnSamplingRule.() -> Unit = {}):
    CfnSamplingRule = CfnSamplingRule(this, id).apply(initializer)
