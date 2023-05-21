package com.faendir.awscdkkt.services.sagemaker

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.sagemaker.CfnInferenceExperiment

@Generated
public
    fun shadowModeConfigProperty(initializer: CfnInferenceExperiment.ShadowModeConfigProperty.Builder.() -> Unit
    = {}): CfnInferenceExperiment.ShadowModeConfigProperty =
    CfnInferenceExperiment.ShadowModeConfigProperty.builder().apply(initializer).build()
