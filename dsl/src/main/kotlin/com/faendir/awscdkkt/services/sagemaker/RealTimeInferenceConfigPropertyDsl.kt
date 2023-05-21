package com.faendir.awscdkkt.services.sagemaker

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.sagemaker.CfnInferenceExperiment

@Generated
public
    fun realTimeInferenceConfigProperty(initializer: CfnInferenceExperiment.RealTimeInferenceConfigProperty.Builder.() -> Unit
    = {}): CfnInferenceExperiment.RealTimeInferenceConfigProperty =
    CfnInferenceExperiment.RealTimeInferenceConfigProperty.builder().apply(initializer).build()
