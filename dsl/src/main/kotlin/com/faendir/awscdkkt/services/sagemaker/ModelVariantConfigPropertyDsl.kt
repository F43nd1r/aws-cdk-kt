package com.faendir.awscdkkt.services.sagemaker

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.sagemaker.CfnInferenceExperiment

@Generated
public
    fun modelVariantConfigProperty(initializer: CfnInferenceExperiment.ModelVariantConfigProperty.Builder.() -> Unit
    = {}): CfnInferenceExperiment.ModelVariantConfigProperty =
    CfnInferenceExperiment.ModelVariantConfigProperty.builder().apply(initializer).build()
