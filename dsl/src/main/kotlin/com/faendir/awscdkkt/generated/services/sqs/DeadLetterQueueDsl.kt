package com.faendir.awscdkkt.generated.services.sqs

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.sqs.DeadLetterQueue

@Generated
public fun buildDeadLetterQueue(initializer: @AwsCdkDsl DeadLetterQueue.Builder.() -> Unit):
    DeadLetterQueue = DeadLetterQueue.Builder().apply(initializer).build()
