package com.faendir.awscdkkt.generated.services.sqs

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.sqs.QueuePolicy
import software.amazon.awscdk.services.sqs.QueuePolicyProps
import software.constructs.Construct

@Generated
public fun Construct.queuePolicy(
  id: String,
  props: QueuePolicyProps,
  initializer: @AwsCdkDsl QueuePolicy.() -> Unit = {},
): QueuePolicy = QueuePolicy(this, id, props).apply(initializer)

@Generated
public fun Construct.buildQueuePolicy(id: String, initializer: @AwsCdkDsl QueuePolicy.Builder.() -> Unit = {}): QueuePolicy = QueuePolicy.Builder.create(this, id).apply(initializer).build()
