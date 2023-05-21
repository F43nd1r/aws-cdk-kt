package com.faendir.awscdkkt.services.events

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.events.CfnRule

@Generated
public
    fun sageMakerPipelineParameterProperty(initializer: CfnRule.SageMakerPipelineParameterProperty.Builder.() -> Unit
    = {}): CfnRule.SageMakerPipelineParameterProperty =
    CfnRule.SageMakerPipelineParameterProperty.builder().apply(initializer).build()
