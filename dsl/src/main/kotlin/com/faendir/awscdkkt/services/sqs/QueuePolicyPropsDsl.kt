package com.faendir.awscdkkt.services.sqs

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.sqs.QueuePolicyProps

@Generated
public fun queuePolicyProps(initializer: QueuePolicyProps.Builder.() -> Unit = {}): QueuePolicyProps
    = QueuePolicyProps.builder().apply(initializer).build()
