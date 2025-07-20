package com.faendir.awscdkkt.generated.services.cloudwatch

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.cloudwatch.CfnInsightRule
import software.amazon.awscdk.services.cloudwatch.CfnInsightRuleProps
import software.constructs.Construct

@Generated
public fun Construct.cfnInsightRule(
  id: String,
  props: CfnInsightRuleProps,
  initializer: @AwsCdkDsl CfnInsightRule.() -> Unit = {},
): CfnInsightRule = CfnInsightRule(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnInsightRule(id: String, initializer: @AwsCdkDsl CfnInsightRule.Builder.() -> Unit = {}): CfnInsightRule = CfnInsightRule.Builder.create(this, id).apply(initializer).build()
