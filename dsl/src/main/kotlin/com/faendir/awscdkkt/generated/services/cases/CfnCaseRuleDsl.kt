package com.faendir.awscdkkt.generated.services.cases

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.cases.CfnCaseRule
import software.amazon.awscdk.services.cases.CfnCaseRuleProps
import software.constructs.Construct

@Generated
public fun Construct.cfnCaseRule(
  id: String,
  props: CfnCaseRuleProps,
  initializer: @AwsCdkDsl CfnCaseRule.() -> Unit = {},
): CfnCaseRule = CfnCaseRule(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnCaseRule(id: String, initializer: @AwsCdkDsl CfnCaseRule.Builder.() -> Unit = {}): CfnCaseRule = CfnCaseRule.Builder.create(this, id).apply(initializer).build()
