package com.faendir.awscdkkt.services.pipes

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.pipes.CfnPipe

@Generated
public
    fun pipeTargetSqsQueueParametersProperty(initializer: CfnPipe.PipeTargetSqsQueueParametersProperty.Builder.() -> Unit
    = {}): CfnPipe.PipeTargetSqsQueueParametersProperty =
    CfnPipe.PipeTargetSqsQueueParametersProperty.builder().apply(initializer).build()
