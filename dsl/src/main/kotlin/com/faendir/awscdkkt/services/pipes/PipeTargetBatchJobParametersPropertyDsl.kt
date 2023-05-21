package com.faendir.awscdkkt.services.pipes

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.pipes.CfnPipe

@Generated
public
    fun pipeTargetBatchJobParametersProperty(initializer: CfnPipe.PipeTargetBatchJobParametersProperty.Builder.() -> Unit
    = {}): CfnPipe.PipeTargetBatchJobParametersProperty =
    CfnPipe.PipeTargetBatchJobParametersProperty.builder().apply(initializer).build()
