package com.faendir.awscdkkt.services.rum

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.rum.CfnAppMonitor

@Generated
public
    fun metricDefinitionProperty(initializer: CfnAppMonitor.MetricDefinitionProperty.Builder.() -> Unit
    = {}): CfnAppMonitor.MetricDefinitionProperty =
    CfnAppMonitor.MetricDefinitionProperty.builder().apply(initializer).build()
