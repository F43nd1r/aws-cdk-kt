package com.faendir.awscdkkt.generated.services.accessanalyzer

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.accessanalyzer.CfnArchiveRule
import software.amazon.awscdk.services.accessanalyzer.CfnArchiveRuleProps
import software.constructs.Construct

@Generated
public fun Construct.cfnArchiveRule(
  id: String,
  props: CfnArchiveRuleProps,
  initializer: @AwsCdkDsl CfnArchiveRule.() -> Unit = {},
): CfnArchiveRule = CfnArchiveRule(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnArchiveRule(id: String, initializer: @AwsCdkDsl CfnArchiveRule.Builder.() -> Unit = {}): CfnArchiveRule = CfnArchiveRule.Builder.create(this, id).apply(initializer).build()
