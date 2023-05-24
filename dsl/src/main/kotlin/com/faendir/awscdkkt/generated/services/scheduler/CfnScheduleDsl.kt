package com.faendir.awscdkkt.generated.services.scheduler

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.scheduler.CfnSchedule
import software.amazon.awscdk.services.scheduler.CfnScheduleProps
import software.constructs.Construct

@Generated
public fun Construct.cfnSchedule(id: String, props: CfnScheduleProps): CfnSchedule =
    CfnSchedule(this, id, props)

@Generated
public fun Construct.cfnSchedule(
  id: String,
  props: CfnScheduleProps,
  initializer: @AwsCdkDsl CfnSchedule.() -> Unit,
): CfnSchedule = CfnSchedule(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnSchedule(id: String, initializer: @AwsCdkDsl
    CfnSchedule.Builder.() -> Unit): CfnSchedule = CfnSchedule.Builder.create(this,
    id).apply(initializer).build()
