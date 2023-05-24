package com.faendir.awscdkkt.generated.services.events.targets

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.events.targets.SqsQueue
import software.amazon.awscdk.services.events.targets.SqsQueueProps
import software.amazon.awscdk.services.sqs.IQueue

@Generated
public fun sqsQueue(queue: IQueue): SqsQueue = SqsQueue(queue)

@Generated
public fun sqsQueue(queue: IQueue, props: SqsQueueProps): SqsQueue = SqsQueue(queue, props)

@Generated
public fun buildSqsQueue(queue: IQueue, initializer: @AwsCdkDsl SqsQueue.Builder.() -> Unit):
    SqsQueue = SqsQueue.Builder.create(queue).apply(initializer).build()
