package com.faendir.awscdkkt.generated.services.databrew

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.databrew.CfnSchedule
import software.amazon.awscdk.services.databrew.CfnScheduleProps
import software.constructs.Construct

@Generated
public fun Construct.cfnSchedule(
  id: String,
  props: CfnScheduleProps,
  initializer: @AwsCdkDsl CfnSchedule.() -> Unit = {},
): CfnSchedule = CfnSchedule(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnSchedule(id: String, initializer: @AwsCdkDsl
    CfnSchedule.Builder.() -> Unit = {}): CfnSchedule = CfnSchedule.Builder.create(this,
    id).apply(initializer).build()
