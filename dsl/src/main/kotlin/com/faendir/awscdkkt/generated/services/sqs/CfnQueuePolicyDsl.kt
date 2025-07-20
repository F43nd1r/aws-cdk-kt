package com.faendir.awscdkkt.generated.services.sqs

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.sqs.CfnQueuePolicy
import software.amazon.awscdk.services.sqs.CfnQueuePolicyProps
import software.constructs.Construct

@Generated
public fun Construct.cfnQueuePolicy(
  id: String,
  props: CfnQueuePolicyProps,
  initializer: @AwsCdkDsl CfnQueuePolicy.() -> Unit = {},
): CfnQueuePolicy = CfnQueuePolicy(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnQueuePolicy(id: String, initializer: @AwsCdkDsl CfnQueuePolicy.Builder.() -> Unit = {}): CfnQueuePolicy = CfnQueuePolicy.Builder.create(this, id).apply(initializer).build()
