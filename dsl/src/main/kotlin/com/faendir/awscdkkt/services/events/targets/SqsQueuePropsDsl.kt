@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.events.targets

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.events.targets.SqsQueueProps

public fun sqsQueueProps(initializer: SqsQueueProps.Builder.() -> Unit): SqsQueueProps =
    SqsQueueProps.builder().apply(initializer).build()
