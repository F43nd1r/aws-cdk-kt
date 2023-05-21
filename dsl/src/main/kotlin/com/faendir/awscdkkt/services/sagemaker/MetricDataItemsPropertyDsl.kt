package com.faendir.awscdkkt.services.sagemaker

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.sagemaker.CfnModelCard

@Generated
public
    fun metricDataItemsProperty(initializer: CfnModelCard.MetricDataItemsProperty.Builder.() -> Unit
    = {}): CfnModelCard.MetricDataItemsProperty =
    CfnModelCard.MetricDataItemsProperty.builder().apply(initializer).build()
