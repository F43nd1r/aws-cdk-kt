package com.faendir.awscdkkt.generated.services.sqs

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.sqs.CfnQueueInlinePolicy
import software.amazon.awscdk.services.sqs.CfnQueueInlinePolicyProps
import software.constructs.Construct

@Generated
public fun Construct.cfnQueueInlinePolicy(
  id: String,
  props: CfnQueueInlinePolicyProps,
  initializer: @AwsCdkDsl CfnQueueInlinePolicy.() -> Unit = {},
): CfnQueueInlinePolicy = CfnQueueInlinePolicy(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnQueueInlinePolicy(id: String, initializer: @AwsCdkDsl CfnQueueInlinePolicy.Builder.() -> Unit = {}): CfnQueueInlinePolicy = CfnQueueInlinePolicy.Builder.create(this, id).apply(initializer).build()
