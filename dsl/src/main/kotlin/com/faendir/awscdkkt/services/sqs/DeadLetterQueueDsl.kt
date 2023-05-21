package com.faendir.awscdkkt.services.sqs

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.sqs.DeadLetterQueue

@Generated
public fun deadLetterQueue(initializer: DeadLetterQueue.Builder.() -> Unit = {}): DeadLetterQueue =
    DeadLetterQueue.builder().apply(initializer).build()
