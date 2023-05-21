package com.faendir.awscdkkt.services.pipes

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.pipes.CfnPipe

@Generated
public
    fun pipeSourceManagedStreamingKafkaParametersProperty(initializer: CfnPipe.PipeSourceManagedStreamingKafkaParametersProperty.Builder.() -> Unit
    = {}): CfnPipe.PipeSourceManagedStreamingKafkaParametersProperty =
    CfnPipe.PipeSourceManagedStreamingKafkaParametersProperty.builder().apply(initializer).build()
