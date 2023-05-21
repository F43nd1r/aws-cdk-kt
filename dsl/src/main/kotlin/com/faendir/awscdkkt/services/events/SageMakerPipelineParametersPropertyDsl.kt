package com.faendir.awscdkkt.services.events

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.events.CfnRule

@Generated
public
    fun sageMakerPipelineParametersProperty(initializer: CfnRule.SageMakerPipelineParametersProperty.Builder.() -> Unit
    = {}): CfnRule.SageMakerPipelineParametersProperty =
    CfnRule.SageMakerPipelineParametersProperty.builder().apply(initializer).build()
