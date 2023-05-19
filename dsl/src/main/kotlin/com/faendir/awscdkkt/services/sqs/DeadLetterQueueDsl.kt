@file:Generated(value = ["Generated 2023-05-19 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.sqs

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.sqs.DeadLetterQueue

public fun deadLetterQueue(initializer: DeadLetterQueue.Builder.() -> Unit): DeadLetterQueue =
    DeadLetterQueue.builder().apply(initializer).build()
