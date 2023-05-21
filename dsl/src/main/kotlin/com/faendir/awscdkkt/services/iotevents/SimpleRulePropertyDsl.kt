package com.faendir.awscdkkt.services.iotevents

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.iotevents.CfnAlarmModel

@Generated
public fun simpleRuleProperty(initializer: CfnAlarmModel.SimpleRuleProperty.Builder.() -> Unit =
    {}): CfnAlarmModel.SimpleRuleProperty =
    CfnAlarmModel.SimpleRuleProperty.builder().apply(initializer).build()
