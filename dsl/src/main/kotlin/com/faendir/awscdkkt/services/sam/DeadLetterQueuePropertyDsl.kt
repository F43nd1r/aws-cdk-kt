package com.faendir.awscdkkt.services.sam

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.sam.CfnFunction

@Generated
public
    fun deadLetterQueueProperty(initializer: CfnFunction.DeadLetterQueueProperty.Builder.() -> Unit
    = {}): CfnFunction.DeadLetterQueueProperty =
    CfnFunction.DeadLetterQueueProperty.builder().apply(initializer).build()
