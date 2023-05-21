package com.faendir.awscdkkt.services.pipes

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.pipes.CfnPipe

@Generated
public
    fun pipeTargetHttpParametersProperty(initializer: CfnPipe.PipeTargetHttpParametersProperty.Builder.() -> Unit
    = {}): CfnPipe.PipeTargetHttpParametersProperty =
    CfnPipe.PipeTargetHttpParametersProperty.builder().apply(initializer).build()
