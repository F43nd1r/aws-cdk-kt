package com.faendir.awscdkkt.services.pipes

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.pipes.CfnPipe

@Generated
public
    fun pipeEnrichmentParametersProperty(initializer: CfnPipe.PipeEnrichmentParametersProperty.Builder.() -> Unit
    = {}): CfnPipe.PipeEnrichmentParametersProperty =
    CfnPipe.PipeEnrichmentParametersProperty.builder().apply(initializer).build()
