package com.faendir.awscdkkt.services.pipes

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.pipes.CfnPipe

@Generated
public
    fun pipeTargetKinesisStreamParametersProperty(initializer: CfnPipe.PipeTargetKinesisStreamParametersProperty.Builder.() -> Unit
    = {}): CfnPipe.PipeTargetKinesisStreamParametersProperty =
    CfnPipe.PipeTargetKinesisStreamParametersProperty.builder().apply(initializer).build()
