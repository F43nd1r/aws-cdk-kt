@file:Generated(value = ["Generated 2023-05-20 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.sagemaker

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.sagemaker.CfnModelCard

public
    fun trainingEnvironmentProperty(initializer: CfnModelCard.TrainingEnvironmentProperty.Builder.() -> Unit):
    CfnModelCard.TrainingEnvironmentProperty =
    CfnModelCard.TrainingEnvironmentProperty.builder().apply(initializer).build()
