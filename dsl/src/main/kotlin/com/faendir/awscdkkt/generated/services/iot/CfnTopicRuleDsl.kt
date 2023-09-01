package com.faendir.awscdkkt.generated.services.iot

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.iot.CfnTopicRule
import software.amazon.awscdk.services.iot.CfnTopicRuleProps
import software.constructs.Construct

@Generated
public fun Construct.cfnTopicRule(
  id: String,
  props: CfnTopicRuleProps,
  initializer: @AwsCdkDsl CfnTopicRule.() -> Unit = {},
): CfnTopicRule = CfnTopicRule(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnTopicRule(id: String, initializer: @AwsCdkDsl
    CfnTopicRule.Builder.() -> Unit = {}): CfnTopicRule = CfnTopicRule.Builder.create(this,
    id).apply(initializer).build()
