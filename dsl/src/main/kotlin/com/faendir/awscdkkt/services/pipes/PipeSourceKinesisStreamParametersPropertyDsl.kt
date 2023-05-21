package com.faendir.awscdkkt.services.pipes

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.pipes.CfnPipe

@Generated
public
    fun pipeSourceKinesisStreamParametersProperty(initializer: CfnPipe.PipeSourceKinesisStreamParametersProperty.Builder.() -> Unit
    = {}): CfnPipe.PipeSourceKinesisStreamParametersProperty =
    CfnPipe.PipeSourceKinesisStreamParametersProperty.builder().apply(initializer).build()
