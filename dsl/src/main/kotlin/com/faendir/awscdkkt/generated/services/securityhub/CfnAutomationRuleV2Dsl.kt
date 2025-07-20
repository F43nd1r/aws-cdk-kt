package com.faendir.awscdkkt.generated.services.securityhub

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.securityhub.CfnAutomationRuleV2
import software.amazon.awscdk.services.securityhub.CfnAutomationRuleV2Props
import software.constructs.Construct

@Generated
public fun Construct.cfnAutomationRuleV2(
  id: String,
  props: CfnAutomationRuleV2Props,
  initializer: @AwsCdkDsl CfnAutomationRuleV2.() -> Unit = {},
): CfnAutomationRuleV2 = CfnAutomationRuleV2(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnAutomationRuleV2(id: String, initializer: @AwsCdkDsl CfnAutomationRuleV2.Builder.() -> Unit = {}): CfnAutomationRuleV2 = CfnAutomationRuleV2.Builder.create(this, id).apply(initializer).build()
