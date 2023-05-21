package com.faendir.awscdkkt.services.sagemaker

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.sagemaker.CfnModelCard

@Generated
public
    fun trainingJobDetailsProperty(initializer: CfnModelCard.TrainingJobDetailsProperty.Builder.() -> Unit
    = {}): CfnModelCard.TrainingJobDetailsProperty =
    CfnModelCard.TrainingJobDetailsProperty.builder().apply(initializer).build()
