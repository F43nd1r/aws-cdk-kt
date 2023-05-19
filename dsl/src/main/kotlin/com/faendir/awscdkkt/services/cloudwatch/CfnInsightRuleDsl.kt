@file:Generated(value = ["Generated 2023-05-19 based on CDK 2.79.1"])

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
