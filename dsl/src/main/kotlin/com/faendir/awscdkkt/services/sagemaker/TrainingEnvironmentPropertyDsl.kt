@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.sagemaker

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.sagemaker.CfnModelCard

public
    fun trainingEnvironmentProperty(initializer: CfnModelCard.TrainingEnvironmentProperty.Builder.() -> Unit):
    CfnModelCard.TrainingEnvironmentProperty =
    CfnModelCard.TrainingEnvironmentProperty.builder().apply(initializer).build()
