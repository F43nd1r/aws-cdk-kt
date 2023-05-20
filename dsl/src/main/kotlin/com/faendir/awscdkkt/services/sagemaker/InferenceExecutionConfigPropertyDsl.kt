@file:Generated(value = ["Generated 2023-05-20 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.sagemaker

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.sagemaker.CfnModel

public
    fun inferenceExecutionConfigProperty(initializer: CfnModel.InferenceExecutionConfigProperty.Builder.() -> Unit):
    CfnModel.InferenceExecutionConfigProperty =
    CfnModel.InferenceExecutionConfigProperty.builder().apply(initializer).build()
