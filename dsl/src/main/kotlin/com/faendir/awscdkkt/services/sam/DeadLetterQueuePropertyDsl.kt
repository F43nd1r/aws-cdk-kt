@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.sam

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.sam.CfnFunction

public
    fun deadLetterQueueProperty(initializer: CfnFunction.DeadLetterQueueProperty.Builder.() -> Unit):
    CfnFunction.DeadLetterQueueProperty =
    CfnFunction.DeadLetterQueueProperty.builder().apply(initializer).build()
