@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.rum

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.rum.CfnAppMonitor

public
    fun metricDefinitionProperty(initializer: CfnAppMonitor.MetricDefinitionProperty.Builder.() -> Unit):
    CfnAppMonitor.MetricDefinitionProperty =
    CfnAppMonitor.MetricDefinitionProperty.builder().apply(initializer).build()
