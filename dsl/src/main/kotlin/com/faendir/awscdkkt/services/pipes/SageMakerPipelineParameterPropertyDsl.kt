package com.faendir.awscdkkt.services.pipes

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.pipes.CfnPipe

@Generated
public
    fun sageMakerPipelineParameterProperty(initializer: CfnPipe.SageMakerPipelineParameterProperty.Builder.() -> Unit
    = {}): CfnPipe.SageMakerPipelineParameterProperty =
    CfnPipe.SageMakerPipelineParameterProperty.builder().apply(initializer).build()
