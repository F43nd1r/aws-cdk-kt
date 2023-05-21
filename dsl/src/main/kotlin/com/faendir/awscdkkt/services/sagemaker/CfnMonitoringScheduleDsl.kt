package com.faendir.awscdkkt.services.sagemaker

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.sagemaker.CfnMonitoringSchedule
import software.amazon.awscdk.services.sagemaker.CfnMonitoringScheduleProps
import software.constructs.Construct

@Generated
public fun Construct.cfnMonitoringSchedule(
  id: String,
  props: CfnMonitoringScheduleProps,
  initializer: CfnMonitoringSchedule.() -> Unit = {},
): CfnMonitoringSchedule = CfnMonitoringSchedule(this, id, props).apply(initializer)
