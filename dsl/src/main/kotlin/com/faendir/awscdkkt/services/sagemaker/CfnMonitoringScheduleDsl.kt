@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.sagemaker

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.sagemaker.CfnMonitoringSchedule
import software.amazon.awscdk.services.sagemaker.CfnMonitoringScheduleProps
import software.constructs.Construct

public fun Construct.cfnMonitoringSchedule(
  id: String,
  props: CfnMonitoringScheduleProps,
  initializer: CfnMonitoringSchedule.() -> Unit = {},
): CfnMonitoringSchedule = CfnMonitoringSchedule(this, id, props).apply(initializer)
