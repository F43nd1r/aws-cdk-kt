package com.faendir.awscdkkt.services.sagemaker

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.sagemaker.CfnModelCard

@Generated
public
    fun trainingHyperParameterProperty(initializer: CfnModelCard.TrainingHyperParameterProperty.Builder.() -> Unit
    = {}): CfnModelCard.TrainingHyperParameterProperty =
    CfnModelCard.TrainingHyperParameterProperty.builder().apply(initializer).build()
