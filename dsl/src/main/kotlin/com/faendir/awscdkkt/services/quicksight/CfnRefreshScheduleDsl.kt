@file:Generated(value = ["Generated 2023-05-20 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.quicksight

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.quicksight.CfnRefreshSchedule
import software.amazon.awscdk.services.quicksight.CfnRefreshScheduleProps
import software.constructs.Construct

public fun Construct.cfnRefreshSchedule(
  id: String,
  props: CfnRefreshScheduleProps,
  initializer: CfnRefreshSchedule.() -> Unit = {},
): CfnRefreshSchedule = CfnRefreshSchedule(this, id, props).apply(initializer)

public fun Construct.cfnRefreshSchedule(id: String, initializer: CfnRefreshSchedule.() -> Unit =
    {}): CfnRefreshSchedule = CfnRefreshSchedule(this, id).apply(initializer)
