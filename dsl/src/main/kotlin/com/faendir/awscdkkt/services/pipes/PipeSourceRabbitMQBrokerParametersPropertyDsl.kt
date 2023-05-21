package com.faendir.awscdkkt.services.pipes

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.pipes.CfnPipe

@Generated
public
    fun pipeSourceRabbitMQBrokerParametersProperty(initializer: CfnPipe.PipeSourceRabbitMQBrokerParametersProperty.Builder.() -> Unit
    = {}): CfnPipe.PipeSourceRabbitMQBrokerParametersProperty =
    CfnPipe.PipeSourceRabbitMQBrokerParametersProperty.builder().apply(initializer).build()
