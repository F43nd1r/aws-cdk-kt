package com.faendir.awscdkkt.services.pipes

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.pipes.CfnPipe

@Generated
public
    fun pipeSourceDynamoDBStreamParametersProperty(initializer: CfnPipe.PipeSourceDynamoDBStreamParametersProperty.Builder.() -> Unit
    = {}): CfnPipe.PipeSourceDynamoDBStreamParametersProperty =
    CfnPipe.PipeSourceDynamoDBStreamParametersProperty.builder().apply(initializer).build()
