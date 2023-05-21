package com.faendir.awscdkkt.services.sagemaker

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.sagemaker.CfnModelCard

@Generated
public
    fun inferenceEnvironmentProperty(initializer: CfnModelCard.InferenceEnvironmentProperty.Builder.() -> Unit
    = {}): CfnModelCard.InferenceEnvironmentProperty =
    CfnModelCard.InferenceEnvironmentProperty.builder().apply(initializer).build()
