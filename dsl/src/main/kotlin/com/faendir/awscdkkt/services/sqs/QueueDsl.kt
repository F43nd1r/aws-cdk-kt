@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.sqs

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.sqs.Queue
import software.amazon.awscdk.services.sqs.QueueProps
import software.constructs.Construct

public fun Construct.queue(id: String, initializer: Queue.() -> Unit = {}): Queue = Queue(this,
    id).apply(initializer)

public fun Construct.queue(
  id: String,
  props: QueueProps,
  initializer: Queue.() -> Unit = {},
): Queue = Queue(this, id, props).apply(initializer)
