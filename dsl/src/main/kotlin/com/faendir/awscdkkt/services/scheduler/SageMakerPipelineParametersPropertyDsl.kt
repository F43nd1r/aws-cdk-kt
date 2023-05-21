package com.faendir.awscdkkt.services.scheduler

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.scheduler.CfnSchedule

@Generated
public
    fun sageMakerPipelineParametersProperty(initializer: CfnSchedule.SageMakerPipelineParametersProperty.Builder.() -> Unit
    = {}): CfnSchedule.SageMakerPipelineParametersProperty =
    CfnSchedule.SageMakerPipelineParametersProperty.builder().apply(initializer).build()
