package com.faendir.awscdkkt.generated.services.lambda.eventsources

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.lambda.eventsources.SqsEventSource
import software.amazon.awscdk.services.lambda.eventsources.SqsEventSourceProps
import software.amazon.awscdk.services.sqs.IQueue

@Generated
public fun sqsEventSource(queue: IQueue): SqsEventSource = SqsEventSource(queue)

@Generated
public fun sqsEventSource(queue: IQueue, props: SqsEventSourceProps): SqsEventSource =
    SqsEventSource(queue, props)

@Generated
public fun buildSqsEventSource(queue: IQueue, initializer: @AwsCdkDsl
    SqsEventSource.Builder.() -> Unit): SqsEventSource =
    SqsEventSource.Builder.create(queue).apply(initializer).build()
