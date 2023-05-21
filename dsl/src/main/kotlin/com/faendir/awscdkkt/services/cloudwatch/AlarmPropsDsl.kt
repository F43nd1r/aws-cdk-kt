package com.faendir.awscdkkt.services.cloudwatch

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.cloudwatch.AlarmProps

@Generated
public fun alarmProps(initializer: AlarmProps.Builder.() -> Unit = {}): AlarmProps =
    AlarmProps.builder().apply(initializer).build()
