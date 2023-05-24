package com.faendir.awscdkkt.generated.services.iot

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.iot.CfnTopicRuleDestination
import software.amazon.awscdk.services.iot.CfnTopicRuleDestinationProps
import software.constructs.Construct

@Generated
public fun Construct.cfnTopicRuleDestination(id: String): CfnTopicRuleDestination =
    CfnTopicRuleDestination(this, id)

@Generated
public fun Construct.cfnTopicRuleDestination(id: String, initializer: @AwsCdkDsl
    CfnTopicRuleDestination.() -> Unit): CfnTopicRuleDestination = CfnTopicRuleDestination(this,
    id).apply(initializer)

@Generated
public fun Construct.cfnTopicRuleDestination(id: String, props: CfnTopicRuleDestinationProps):
    CfnTopicRuleDestination = CfnTopicRuleDestination(this, id, props)

@Generated
public fun Construct.cfnTopicRuleDestination(
  id: String,
  props: CfnTopicRuleDestinationProps,
  initializer: @AwsCdkDsl CfnTopicRuleDestination.() -> Unit,
): CfnTopicRuleDestination = CfnTopicRuleDestination(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnTopicRuleDestination(id: String, initializer: @AwsCdkDsl
    CfnTopicRuleDestination.Builder.() -> Unit): CfnTopicRuleDestination =
    CfnTopicRuleDestination.Builder.create(this, id).apply(initializer).build()
