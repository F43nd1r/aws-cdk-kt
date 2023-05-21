package com.faendir.awscdkkt.services.pipes

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.pipes.CfnPipe

@Generated
public
    fun pipeSourceParametersProperty(initializer: CfnPipe.PipeSourceParametersProperty.Builder.() -> Unit
    = {}): CfnPipe.PipeSourceParametersProperty =
    CfnPipe.PipeSourceParametersProperty.builder().apply(initializer).build()
