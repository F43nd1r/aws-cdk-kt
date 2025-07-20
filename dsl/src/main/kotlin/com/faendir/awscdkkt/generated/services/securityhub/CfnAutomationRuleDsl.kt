package com.faendir.awscdkkt.generated.services.securityhub

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.securityhub.CfnAutomationRule
import software.amazon.awscdk.services.securityhub.CfnAutomationRuleProps
import software.constructs.Construct

@Generated
public fun Construct.cfnAutomationRule(
  id: String,
  props: CfnAutomationRuleProps,
  initializer: @AwsCdkDsl CfnAutomationRule.() -> Unit = {},
): CfnAutomationRule = CfnAutomationRule(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnAutomationRule(id: String, initializer: @AwsCdkDsl CfnAutomationRule.Builder.() -> Unit = {}): CfnAutomationRule = CfnAutomationRule.Builder.create(this, id).apply(initializer).build()
