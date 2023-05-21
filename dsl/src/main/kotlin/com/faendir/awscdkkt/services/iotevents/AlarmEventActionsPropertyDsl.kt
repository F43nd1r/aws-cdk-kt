package com.faendir.awscdkkt.services.iotevents

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.iotevents.CfnAlarmModel

@Generated
public
    fun alarmEventActionsProperty(initializer: CfnAlarmModel.AlarmEventActionsProperty.Builder.() -> Unit
    = {}): CfnAlarmModel.AlarmEventActionsProperty =
    CfnAlarmModel.AlarmEventActionsProperty.builder().apply(initializer).build()
