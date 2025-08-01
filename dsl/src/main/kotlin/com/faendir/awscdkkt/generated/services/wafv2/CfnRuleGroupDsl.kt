package com.faendir.awscdkkt.generated.services.wafv2

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.wafv2.CfnRuleGroup
import software.amazon.awscdk.services.wafv2.CfnRuleGroupProps
import software.constructs.Construct

@Generated
public fun Construct.cfnRuleGroup(
  id: String,
  props: CfnRuleGroupProps,
  initializer: @AwsCdkDsl CfnRuleGroup.() -> Unit = {},
): CfnRuleGroup = CfnRuleGroup(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnRuleGroup(id: String, initializer: @AwsCdkDsl CfnRuleGroup.Builder.() -> Unit = {}): CfnRuleGroup = CfnRuleGroup.Builder.create(this, id).apply(initializer).build()
