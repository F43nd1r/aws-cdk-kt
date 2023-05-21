package com.faendir.awscdkkt.services.applicationinsights

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.applicationinsights.CfnApplication

@Generated
public fun alarmMetricProperty(initializer: CfnApplication.AlarmMetricProperty.Builder.() -> Unit =
    {}): CfnApplication.AlarmMetricProperty =
    CfnApplication.AlarmMetricProperty.builder().apply(initializer).build()
