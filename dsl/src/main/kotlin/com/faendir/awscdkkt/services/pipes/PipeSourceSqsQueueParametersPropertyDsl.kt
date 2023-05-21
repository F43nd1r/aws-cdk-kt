package com.faendir.awscdkkt.services.pipes

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.pipes.CfnPipe

@Generated
public
    fun pipeSourceSqsQueueParametersProperty(initializer: CfnPipe.PipeSourceSqsQueueParametersProperty.Builder.() -> Unit
    = {}): CfnPipe.PipeSourceSqsQueueParametersProperty =
    CfnPipe.PipeSourceSqsQueueParametersProperty.builder().apply(initializer).build()
