package com.faendir.awscdkkt.services.sagemaker

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.sagemaker.CfnModel

@Generated
public
    fun inferenceExecutionConfigProperty(initializer: CfnModel.InferenceExecutionConfigProperty.Builder.() -> Unit
    = {}): CfnModel.InferenceExecutionConfigProperty =
    CfnModel.InferenceExecutionConfigProperty.builder().apply(initializer).build()
