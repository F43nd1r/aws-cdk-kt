package com.faendir.awscdkkt.services.cloudwatch

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.cloudwatch.GaugeWidgetProps

@Generated
public fun gaugeWidgetProps(initializer: GaugeWidgetProps.Builder.() -> Unit = {}): GaugeWidgetProps
    = GaugeWidgetProps.builder().apply(initializer).build()
