package com.faendir.awscdkkt.generated.services.sqs

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.sqs.Queue
import software.amazon.awscdk.services.sqs.QueueProps
import software.constructs.Construct

@Generated
public fun Construct.queue(id: String, initializer: @AwsCdkDsl Queue.() -> Unit = {}): Queue =
    Queue(this, id).apply(initializer)

@Generated
public fun Construct.queue(
  id: String,
  props: QueueProps,
  initializer: @AwsCdkDsl Queue.() -> Unit = {},
): Queue = Queue(this, id, props).apply(initializer)

@Generated
public fun Construct.buildQueue(id: String, initializer: @AwsCdkDsl Queue.Builder.() -> Unit = {}):
    Queue = Queue.Builder.create(this, id).apply(initializer).build()
