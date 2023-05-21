package com.faendir.awscdkkt.services.applicationinsights

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.applicationinsights.CfnApplication

@Generated
public fun alarmProperty(initializer: CfnApplication.AlarmProperty.Builder.() -> Unit = {}):
    CfnApplication.AlarmProperty = CfnApplication.AlarmProperty.builder().apply(initializer).build()
