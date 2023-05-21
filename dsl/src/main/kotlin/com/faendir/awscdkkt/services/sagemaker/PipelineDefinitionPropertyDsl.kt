package com.faendir.awscdkkt.services.sagemaker

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.sagemaker.CfnPipeline

@Generated
public
    fun pipelineDefinitionProperty(initializer: CfnPipeline.PipelineDefinitionProperty.Builder.() -> Unit
    = {}): CfnPipeline.PipelineDefinitionProperty =
    CfnPipeline.PipelineDefinitionProperty.builder().apply(initializer).build()
