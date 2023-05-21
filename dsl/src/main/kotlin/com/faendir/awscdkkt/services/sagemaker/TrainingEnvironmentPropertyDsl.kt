package com.faendir.awscdkkt.services.sagemaker

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.sagemaker.CfnModelCard

@Generated
public
    fun trainingEnvironmentProperty(initializer: CfnModelCard.TrainingEnvironmentProperty.Builder.() -> Unit
    = {}): CfnModelCard.TrainingEnvironmentProperty =
    CfnModelCard.TrainingEnvironmentProperty.builder().apply(initializer).build()
