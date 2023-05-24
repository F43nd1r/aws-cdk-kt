package com.faendir.awscdkkt.generated.services.scheduler

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.scheduler.CfnScheduleGroup
import software.amazon.awscdk.services.scheduler.CfnScheduleGroupProps
import software.constructs.Construct

@Generated
public fun Construct.cfnScheduleGroup(id: String): CfnScheduleGroup = CfnScheduleGroup(this, id)

@Generated
public fun Construct.cfnScheduleGroup(id: String, initializer: @AwsCdkDsl
    CfnScheduleGroup.() -> Unit): CfnScheduleGroup = CfnScheduleGroup(this, id).apply(initializer)

@Generated
public fun Construct.cfnScheduleGroup(id: String, props: CfnScheduleGroupProps): CfnScheduleGroup =
    CfnScheduleGroup(this, id, props)

@Generated
public fun Construct.cfnScheduleGroup(
  id: String,
  props: CfnScheduleGroupProps,
  initializer: @AwsCdkDsl CfnScheduleGroup.() -> Unit,
): CfnScheduleGroup = CfnScheduleGroup(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnScheduleGroup(id: String, initializer: @AwsCdkDsl
    CfnScheduleGroup.Builder.() -> Unit): CfnScheduleGroup = CfnScheduleGroup.Builder.create(this,
    id).apply(initializer).build()
