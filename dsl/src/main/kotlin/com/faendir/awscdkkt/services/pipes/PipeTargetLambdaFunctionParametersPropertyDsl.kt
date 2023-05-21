package com.faendir.awscdkkt.services.pipes

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.pipes.CfnPipe

@Generated
public
    fun pipeTargetLambdaFunctionParametersProperty(initializer: CfnPipe.PipeTargetLambdaFunctionParametersProperty.Builder.() -> Unit
    = {}): CfnPipe.PipeTargetLambdaFunctionParametersProperty =
    CfnPipe.PipeTargetLambdaFunctionParametersProperty.builder().apply(initializer).build()
