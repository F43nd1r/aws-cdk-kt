package com.faendir.awscdkkt.services.iotevents

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.iotevents.CfnAlarmModel

@Generated
public fun alarmRuleProperty(initializer: CfnAlarmModel.AlarmRuleProperty.Builder.() -> Unit = {}):
    CfnAlarmModel.AlarmRuleProperty =
    CfnAlarmModel.AlarmRuleProperty.builder().apply(initializer).build()
