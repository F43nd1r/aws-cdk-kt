package com.faendir.awscdkkt.services.pipes

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.pipes.CfnPipe

@Generated
public
    fun pipeEnrichmentHttpParametersProperty(initializer: CfnPipe.PipeEnrichmentHttpParametersProperty.Builder.() -> Unit
    = {}): CfnPipe.PipeEnrichmentHttpParametersProperty =
    CfnPipe.PipeEnrichmentHttpParametersProperty.builder().apply(initializer).build()
