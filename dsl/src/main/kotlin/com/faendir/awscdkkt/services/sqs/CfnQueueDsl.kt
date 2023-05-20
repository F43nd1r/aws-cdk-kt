@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.sqs

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.sqs.CfnQueue
import software.amazon.awscdk.services.sqs.CfnQueueProps
import software.constructs.Construct

public fun Construct.cfnQueue(id: String, initializer: CfnQueue.() -> Unit = {}): CfnQueue =
    CfnQueue(this, id).apply(initializer)

public fun Construct.cfnQueue(
  id: String,
  props: CfnQueueProps,
  initializer: CfnQueue.() -> Unit = {},
): CfnQueue = CfnQueue(this, id, props).apply(initializer)
