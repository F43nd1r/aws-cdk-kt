package com.faendir.awscdkkt.generated.services.events.targets

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.events.targets.SqsQueue
import software.amazon.awscdk.services.sqs.IQueue

@Generated
public fun buildSqsQueue(queue: IQueue, initializer: @AwsCdkDsl SqsQueue.Builder.() -> Unit = {}):
    SqsQueue = SqsQueue.Builder.create(queue).apply(initializer).build()
