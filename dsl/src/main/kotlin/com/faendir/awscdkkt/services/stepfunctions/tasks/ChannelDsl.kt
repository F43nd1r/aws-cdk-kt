package com.faendir.awscdkkt.services.stepfunctions.tasks

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.stepfunctions.tasks.Channel

@Generated
public fun channel(initializer: Channel.Builder.() -> Unit = {}): Channel =
    Channel.builder().apply(initializer).build()
