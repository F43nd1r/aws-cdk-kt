package com.faendir.awscdkkt.generated.services.sam

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.sam.CfnFunction

@Generated
public fun buildDeadLetterQueueProperty(initializer: @AwsCdkDsl
    CfnFunction.DeadLetterQueueProperty.Builder.() -> Unit = {}):
    CfnFunction.DeadLetterQueueProperty =
    CfnFunction.DeadLetterQueueProperty.Builder().apply(initializer).build()
