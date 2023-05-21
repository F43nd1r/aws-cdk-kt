package com.faendir.awscdkkt.services.sagemaker

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.sagemaker.CfnInferenceExperiment

@Generated
public
    fun modelInfrastructureConfigProperty(initializer: CfnInferenceExperiment.ModelInfrastructureConfigProperty.Builder.() -> Unit
    = {}): CfnInferenceExperiment.ModelInfrastructureConfigProperty =
    CfnInferenceExperiment.ModelInfrastructureConfigProperty.builder().apply(initializer).build()
