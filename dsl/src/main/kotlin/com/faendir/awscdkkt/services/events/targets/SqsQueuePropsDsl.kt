package com.faendir.awscdkkt.services.events.targets

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.events.targets.SqsQueueProps

@Generated
public fun sqsQueueProps(initializer: SqsQueueProps.Builder.() -> Unit = {}): SqsQueueProps =
    SqsQueueProps.builder().apply(initializer).build()
