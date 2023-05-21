package com.faendir.awscdkkt.services.datapipeline

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.datapipeline.CfnPipeline

@Generated
public fun pipelineTagProperty(initializer: CfnPipeline.PipelineTagProperty.Builder.() -> Unit =
    {}): CfnPipeline.PipelineTagProperty =
    CfnPipeline.PipelineTagProperty.builder().apply(initializer).build()
