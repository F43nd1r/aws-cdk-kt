package com.faendir.awscdkkt.services.iotevents

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.iotevents.CfnAlarmModel

@Generated
public
    fun acknowledgeFlowProperty(initializer: CfnAlarmModel.AcknowledgeFlowProperty.Builder.() -> Unit
    = {}): CfnAlarmModel.AcknowledgeFlowProperty =
    CfnAlarmModel.AcknowledgeFlowProperty.builder().apply(initializer).build()
