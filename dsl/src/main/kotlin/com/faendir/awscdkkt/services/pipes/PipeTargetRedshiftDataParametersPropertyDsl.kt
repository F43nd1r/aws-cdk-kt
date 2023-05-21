package com.faendir.awscdkkt.services.pipes

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.pipes.CfnPipe

@Generated
public
    fun pipeTargetRedshiftDataParametersProperty(initializer: CfnPipe.PipeTargetRedshiftDataParametersProperty.Builder.() -> Unit
    = {}): CfnPipe.PipeTargetRedshiftDataParametersProperty =
    CfnPipe.PipeTargetRedshiftDataParametersProperty.builder().apply(initializer).build()
