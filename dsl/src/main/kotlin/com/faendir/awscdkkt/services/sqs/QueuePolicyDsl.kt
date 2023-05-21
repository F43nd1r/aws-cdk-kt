package com.faendir.awscdkkt.services.sqs

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
  initializer: QueuePolicy.() -> Unit = {},
): QueuePolicy = QueuePolicy(this, id, props).apply(initializer)
