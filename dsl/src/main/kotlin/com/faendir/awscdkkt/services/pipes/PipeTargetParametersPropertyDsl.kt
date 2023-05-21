package com.faendir.awscdkkt.services.pipes

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.pipes.CfnPipe

@Generated
public
    fun pipeTargetParametersProperty(initializer: CfnPipe.PipeTargetParametersProperty.Builder.() -> Unit
    = {}): CfnPipe.PipeTargetParametersProperty =
    CfnPipe.PipeTargetParametersProperty.builder().apply(initializer).build()
