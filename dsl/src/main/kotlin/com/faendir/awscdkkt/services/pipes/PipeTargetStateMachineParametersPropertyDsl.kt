package com.faendir.awscdkkt.services.pipes

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.pipes.CfnPipe

@Generated
public
    fun pipeTargetStateMachineParametersProperty(initializer: CfnPipe.PipeTargetStateMachineParametersProperty.Builder.() -> Unit
    = {}): CfnPipe.PipeTargetStateMachineParametersProperty =
    CfnPipe.PipeTargetStateMachineParametersProperty.builder().apply(initializer).build()
