package com.faendir.awscdkkt.services.sqs

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.sqs.QueueProps

@Generated
public fun queueProps(initializer: QueueProps.Builder.() -> Unit = {}): QueueProps =
    QueueProps.builder().apply(initializer).build()
