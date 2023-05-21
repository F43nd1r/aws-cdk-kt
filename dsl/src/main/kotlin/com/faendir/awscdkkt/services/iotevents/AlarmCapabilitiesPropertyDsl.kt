package com.faendir.awscdkkt.services.iotevents

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.iotevents.CfnAlarmModel

@Generated
public
    fun alarmCapabilitiesProperty(initializer: CfnAlarmModel.AlarmCapabilitiesProperty.Builder.() -> Unit
    = {}): CfnAlarmModel.AlarmCapabilitiesProperty =
    CfnAlarmModel.AlarmCapabilitiesProperty.builder().apply(initializer).build()
