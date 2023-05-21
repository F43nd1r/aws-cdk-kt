package com.faendir.awscdkkt.services.sagemaker

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.sagemaker.CfnInferenceExperiment

@Generated
public
    fun shadowModelVariantConfigProperty(initializer: CfnInferenceExperiment.ShadowModelVariantConfigProperty.Builder.() -> Unit
    = {}): CfnInferenceExperiment.ShadowModelVariantConfigProperty =
    CfnInferenceExperiment.ShadowModelVariantConfigProperty.builder().apply(initializer).build()
