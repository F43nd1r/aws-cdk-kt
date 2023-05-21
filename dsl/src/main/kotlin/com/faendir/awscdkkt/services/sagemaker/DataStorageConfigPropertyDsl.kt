package com.faendir.awscdkkt.services.sagemaker

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.sagemaker.CfnInferenceExperiment

@Generated
public
    fun dataStorageConfigProperty(initializer: CfnInferenceExperiment.DataStorageConfigProperty.Builder.() -> Unit
    = {}): CfnInferenceExperiment.DataStorageConfigProperty =
    CfnInferenceExperiment.DataStorageConfigProperty.builder().apply(initializer).build()
