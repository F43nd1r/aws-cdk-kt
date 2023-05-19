@file:Generated(value = ["Generated 2023-05-19 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.sqs

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.sqs.QueueAttributes

public fun queueAttributes(initializer: QueueAttributes.Builder.() -> Unit): QueueAttributes =
    QueueAttributes.builder().apply(initializer).build()
