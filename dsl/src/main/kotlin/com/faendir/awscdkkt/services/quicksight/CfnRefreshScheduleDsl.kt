package com.faendir.awscdkkt.services.quicksight

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.quicksight.CfnRefreshSchedule
import software.amazon.awscdk.services.quicksight.CfnRefreshScheduleProps
import software.constructs.Construct

@Generated
public fun Construct.cfnRefreshSchedule(id: String, initializer: CfnRefreshSchedule.() -> Unit =
    {}): CfnRefreshSchedule = CfnRefreshSchedule(this, id).apply(initializer)

@Generated
public fun Construct.cfnRefreshSchedule(
  id: String,
  props: CfnRefreshScheduleProps,
  initializer: CfnRefreshSchedule.() -> Unit = {},
): CfnRefreshSchedule = CfnRefreshSchedule(this, id, props).apply(initializer)
