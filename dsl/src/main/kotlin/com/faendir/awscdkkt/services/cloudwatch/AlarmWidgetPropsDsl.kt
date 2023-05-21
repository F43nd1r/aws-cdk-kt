package com.faendir.awscdkkt.services.cloudwatch

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.cloudwatch.AlarmWidgetProps

@Generated
public fun alarmWidgetProps(initializer: AlarmWidgetProps.Builder.() -> Unit = {}): AlarmWidgetProps
    = AlarmWidgetProps.builder().apply(initializer).build()
