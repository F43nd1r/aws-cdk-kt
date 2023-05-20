@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.cloudwatch

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.cloudwatch.CfnInsightRule
import software.amazon.awscdk.services.cloudwatch.CfnInsightRuleProps
import software.constructs.Construct

public fun Construct.cfnInsightRule(
  id: String,
  props: CfnInsightRuleProps,
  initializer: CfnInsightRule.() -> Unit = {},
): CfnInsightRule = CfnInsightRule(this, id, props).apply(initializer)
