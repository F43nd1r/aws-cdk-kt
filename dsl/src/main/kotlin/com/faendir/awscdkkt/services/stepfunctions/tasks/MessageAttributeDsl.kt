package com.faendir.awscdkkt.services.stepfunctions.tasks

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.stepfunctions.tasks.MessageAttribute

@Generated
public fun messageAttribute(initializer: MessageAttribute.Builder.() -> Unit = {}): MessageAttribute
    = MessageAttribute.builder().apply(initializer).build()
