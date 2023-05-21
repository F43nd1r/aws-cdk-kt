package com.faendir.awscdkkt.services.iotevents

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.iotevents.CfnAlarmModel

@Generated
public fun alarmActionProperty(initializer: CfnAlarmModel.AlarmActionProperty.Builder.() -> Unit =
    {}): CfnAlarmModel.AlarmActionProperty =
    CfnAlarmModel.AlarmActionProperty.builder().apply(initializer).build()
