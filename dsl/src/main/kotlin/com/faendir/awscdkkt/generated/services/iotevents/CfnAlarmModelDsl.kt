package com.faendir.awscdkkt.generated.services.iotevents

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.iotevents.CfnAlarmModel
import software.amazon.awscdk.services.iotevents.CfnAlarmModelProps
import software.constructs.Construct

@Generated
public fun Construct.cfnAlarmModel(id: String, props: CfnAlarmModelProps): CfnAlarmModel =
    CfnAlarmModel(this, id, props)

@Generated
public fun Construct.cfnAlarmModel(
  id: String,
  props: CfnAlarmModelProps,
  initializer: @AwsCdkDsl CfnAlarmModel.() -> Unit,
): CfnAlarmModel = CfnAlarmModel(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnAlarmModel(id: String, initializer: @AwsCdkDsl
    CfnAlarmModel.Builder.() -> Unit): CfnAlarmModel = CfnAlarmModel.Builder.create(this,
    id).apply(initializer).build()
