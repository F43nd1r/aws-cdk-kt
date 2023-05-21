package com.faendir.awscdkkt.services.pipes

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.pipes.CfnPipe

@Generated
public
    fun pipeSourceSelfManagedKafkaParametersProperty(initializer: CfnPipe.PipeSourceSelfManagedKafkaParametersProperty.Builder.() -> Unit
    = {}): CfnPipe.PipeSourceSelfManagedKafkaParametersProperty =
    CfnPipe.PipeSourceSelfManagedKafkaParametersProperty.builder().apply(initializer).build()
