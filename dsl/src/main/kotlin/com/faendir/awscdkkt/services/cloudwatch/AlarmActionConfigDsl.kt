package com.faendir.awscdkkt.services.cloudwatch

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.cloudwatch.AlarmActionConfig

@Generated
public fun alarmActionConfig(initializer: AlarmActionConfig.Builder.() -> Unit = {}):
    AlarmActionConfig = AlarmActionConfig.builder().apply(initializer).build()
