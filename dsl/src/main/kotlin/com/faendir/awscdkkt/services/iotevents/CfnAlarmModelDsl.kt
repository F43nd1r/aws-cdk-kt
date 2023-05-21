package com.faendir.awscdkkt.services.iotevents

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.iotevents.CfnAlarmModel
import software.amazon.awscdk.services.iotevents.CfnAlarmModelProps
import software.constructs.Construct

@Generated
public fun Construct.cfnAlarmModel(
  id: String,
  props: CfnAlarmModelProps,
  initializer: CfnAlarmModel.() -> Unit = {},
): CfnAlarmModel = CfnAlarmModel(this, id, props).apply(initializer)
