@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.quicksight

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.quicksight.CfnRefreshSchedule
import software.amazon.awscdk.services.quicksight.CfnRefreshScheduleProps
import software.constructs.Construct

public fun Construct.cfnRefreshSchedule(id: String, initializer: CfnRefreshSchedule.() -> Unit =
    {}): CfnRefreshSchedule = CfnRefreshSchedule(this, id).apply(initializer)

public fun Construct.cfnRefreshSchedule(
  id: String,
  props: CfnRefreshScheduleProps,
  initializer: CfnRefreshSchedule.() -> Unit = {},
): CfnRefreshSchedule = CfnRefreshSchedule(this, id, props).apply(initializer)
