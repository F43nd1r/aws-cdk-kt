package com.faendir.awscdkkt.services.pipes

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.pipes.CfnPipe

@Generated
public fun deadLetterConfigProperty(initializer: CfnPipe.DeadLetterConfigProperty.Builder.() -> Unit
    = {}): CfnPipe.DeadLetterConfigProperty =
    CfnPipe.DeadLetterConfigProperty.builder().apply(initializer).build()
