package com.faendir.awscdkkt.services.scheduler

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.scheduler.CfnSchedule

@Generated
public
    fun sageMakerPipelineParameterProperty(initializer: CfnSchedule.SageMakerPipelineParameterProperty.Builder.() -> Unit
    = {}): CfnSchedule.SageMakerPipelineParameterProperty =
    CfnSchedule.SageMakerPipelineParameterProperty.builder().apply(initializer).build()
