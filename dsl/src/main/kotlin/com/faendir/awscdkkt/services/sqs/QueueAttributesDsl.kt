package com.faendir.awscdkkt.services.sqs

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.sqs.QueueAttributes

@Generated
public fun queueAttributes(initializer: QueueAttributes.Builder.() -> Unit = {}): QueueAttributes =
    QueueAttributes.builder().apply(initializer).build()
