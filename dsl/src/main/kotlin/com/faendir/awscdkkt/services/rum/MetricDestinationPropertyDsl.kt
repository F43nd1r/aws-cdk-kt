package com.faendir.awscdkkt.services.rum

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.rum.CfnAppMonitor

@Generated
public
    fun metricDestinationProperty(initializer: CfnAppMonitor.MetricDestinationProperty.Builder.() -> Unit
    = {}): CfnAppMonitor.MetricDestinationProperty =
    CfnAppMonitor.MetricDestinationProperty.builder().apply(initializer).build()
