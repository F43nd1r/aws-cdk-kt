package com.faendir.awscdkkt.services.sagemaker

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.sagemaker.CfnInferenceExperiment

@Generated
public
    fun endpointMetadataProperty(initializer: CfnInferenceExperiment.EndpointMetadataProperty.Builder.() -> Unit
    = {}): CfnInferenceExperiment.EndpointMetadataProperty =
    CfnInferenceExperiment.EndpointMetadataProperty.builder().apply(initializer).build()
