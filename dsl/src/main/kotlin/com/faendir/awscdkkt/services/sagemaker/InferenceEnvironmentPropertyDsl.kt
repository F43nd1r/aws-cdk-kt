@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.sagemaker

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.sagemaker.CfnModelCard

public
    fun inferenceEnvironmentProperty(initializer: CfnModelCard.InferenceEnvironmentProperty.Builder.() -> Unit):
    CfnModelCard.InferenceEnvironmentProperty =
    CfnModelCard.InferenceEnvironmentProperty.builder().apply(initializer).build()
