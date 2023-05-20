@file:Generated(value = ["Generated 2023-05-20 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.sqs

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.sqs.QueuePolicy
import software.amazon.awscdk.services.sqs.QueuePolicyProps
import software.constructs.Construct

public fun Construct.queuePolicy(
  id: String,
  props: QueuePolicyProps,
  initializer: QueuePolicy.() -> Unit = {},
): QueuePolicy = QueuePolicy(this, id, props).apply(initializer)
