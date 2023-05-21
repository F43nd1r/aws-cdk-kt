package com.faendir.awscdkkt.services.sagemaker

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.sagemaker.CfnModelCard

@Generated
public fun metricGroupProperty(initializer: CfnModelCard.MetricGroupProperty.Builder.() -> Unit =
    {}): CfnModelCard.MetricGroupProperty =
    CfnModelCard.MetricGroupProperty.builder().apply(initializer).build()
