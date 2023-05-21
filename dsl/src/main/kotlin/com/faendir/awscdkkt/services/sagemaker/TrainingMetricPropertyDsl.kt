package com.faendir.awscdkkt.services.sagemaker

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.sagemaker.CfnModelCard

@Generated
public
    fun trainingMetricProperty(initializer: CfnModelCard.TrainingMetricProperty.Builder.() -> Unit =
    {}): CfnModelCard.TrainingMetricProperty =
    CfnModelCard.TrainingMetricProperty.builder().apply(initializer).build()
