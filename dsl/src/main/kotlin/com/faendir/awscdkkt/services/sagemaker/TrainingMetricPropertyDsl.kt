@file:Generated(value = ["Generated 2023-05-20 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.sagemaker

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.sagemaker.CfnModelCard

public
    fun trainingMetricProperty(initializer: CfnModelCard.TrainingMetricProperty.Builder.() -> Unit):
    CfnModelCard.TrainingMetricProperty =
    CfnModelCard.TrainingMetricProperty.builder().apply(initializer).build()
