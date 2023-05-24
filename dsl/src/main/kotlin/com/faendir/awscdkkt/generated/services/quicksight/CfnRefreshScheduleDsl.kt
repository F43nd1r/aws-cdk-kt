package com.faendir.awscdkkt.generated.services.quicksight

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.quicksight.CfnRefreshSchedule
import software.amazon.awscdk.services.quicksight.CfnRefreshScheduleProps
import software.constructs.Construct

@Generated
public fun Construct.cfnRefreshSchedule(id: String): CfnRefreshSchedule = CfnRefreshSchedule(this,
    id)

@Generated
public fun Construct.cfnRefreshSchedule(id: String, initializer: @AwsCdkDsl
    CfnRefreshSchedule.() -> Unit): CfnRefreshSchedule = CfnRefreshSchedule(this,
    id).apply(initializer)

@Generated
public fun Construct.cfnRefreshSchedule(id: String, props: CfnRefreshScheduleProps):
    CfnRefreshSchedule = CfnRefreshSchedule(this, id, props)

@Generated
public fun Construct.cfnRefreshSchedule(
  id: String,
  props: CfnRefreshScheduleProps,
  initializer: @AwsCdkDsl CfnRefreshSchedule.() -> Unit,
): CfnRefreshSchedule = CfnRefreshSchedule(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnRefreshSchedule(id: String, initializer: @AwsCdkDsl
    CfnRefreshSchedule.Builder.() -> Unit): CfnRefreshSchedule =
    CfnRefreshSchedule.Builder.create(this, id).apply(initializer).build()
