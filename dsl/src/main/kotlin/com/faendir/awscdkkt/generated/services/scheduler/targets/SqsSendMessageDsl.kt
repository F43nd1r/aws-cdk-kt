package com.faendir.awscdkkt.generated.services.scheduler.targets

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.scheduler.targets.SqsSendMessage
import software.amazon.awscdk.services.sqs.IQueue

@Generated
public fun buildSqsSendMessage(queue: IQueue, initializer: @AwsCdkDsl
    SqsSendMessage.Builder.() -> Unit = {}): SqsSendMessage =
    SqsSendMessage.Builder.create(queue).apply(initializer).build()
