package com.faendir.awscdkkt.services.iot

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.iot.CfnFleetMetric

@Generated
public
    fun aggregationTypeProperty(initializer: CfnFleetMetric.AggregationTypeProperty.Builder.() -> Unit
    = {}): CfnFleetMetric.AggregationTypeProperty =
    CfnFleetMetric.AggregationTypeProperty.builder().apply(initializer).build()
