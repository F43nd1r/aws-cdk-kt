package com.faendir.awscdkkt.services.logs

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.logs.CfnMetricFilter

@Generated
public fun dimensionProperty(initializer: CfnMetricFilter.DimensionProperty.Builder.() -> Unit =
    {}): CfnMetricFilter.DimensionProperty =
    CfnMetricFilter.DimensionProperty.builder().apply(initializer).build()
