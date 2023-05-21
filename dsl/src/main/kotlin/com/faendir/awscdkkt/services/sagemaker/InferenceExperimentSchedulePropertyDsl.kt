package com.faendir.awscdkkt.services.sagemaker

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.sagemaker.CfnInferenceExperiment

@Generated
public
    fun inferenceExperimentScheduleProperty(initializer: CfnInferenceExperiment.InferenceExperimentScheduleProperty.Builder.() -> Unit
    = {}): CfnInferenceExperiment.InferenceExperimentScheduleProperty =
    CfnInferenceExperiment.InferenceExperimentScheduleProperty.builder().apply(initializer).build()
