@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.sqs

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.sqs.QueueProps

public fun queueProps(initializer: QueueProps.Builder.() -> Unit): QueueProps =
    QueueProps.builder().apply(initializer).build()
