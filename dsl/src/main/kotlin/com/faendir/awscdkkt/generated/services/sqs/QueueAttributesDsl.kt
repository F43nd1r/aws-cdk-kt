package com.faendir.awscdkkt.generated.services.sqs

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.sqs.QueueAttributes

@Generated
public fun buildQueueAttributes(initializer: @AwsCdkDsl QueueAttributes.Builder.() -> Unit):
    QueueAttributes = QueueAttributes.Builder().apply(initializer).build()
