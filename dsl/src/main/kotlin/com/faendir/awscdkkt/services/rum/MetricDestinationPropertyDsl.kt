@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.rum

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.rum.CfnAppMonitor

public
    fun metricDestinationProperty(initializer: CfnAppMonitor.MetricDestinationProperty.Builder.() -> Unit):
    CfnAppMonitor.MetricDestinationProperty =
    CfnAppMonitor.MetricDestinationProperty.builder().apply(initializer).build()
