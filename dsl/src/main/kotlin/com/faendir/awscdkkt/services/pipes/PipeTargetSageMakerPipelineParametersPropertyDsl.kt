package com.faendir.awscdkkt.services.pipes

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.pipes.CfnPipe

@Generated
public
    fun pipeTargetSageMakerPipelineParametersProperty(initializer: CfnPipe.PipeTargetSageMakerPipelineParametersProperty.Builder.() -> Unit
    = {}): CfnPipe.PipeTargetSageMakerPipelineParametersProperty =
    CfnPipe.PipeTargetSageMakerPipelineParametersProperty.builder().apply(initializer).build()
