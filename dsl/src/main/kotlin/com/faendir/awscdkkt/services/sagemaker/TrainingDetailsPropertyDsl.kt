package com.faendir.awscdkkt.services.sagemaker

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.sagemaker.CfnModelCard

@Generated
public
    fun trainingDetailsProperty(initializer: CfnModelCard.TrainingDetailsProperty.Builder.() -> Unit
    = {}): CfnModelCard.TrainingDetailsProperty =
    CfnModelCard.TrainingDetailsProperty.builder().apply(initializer).build()
