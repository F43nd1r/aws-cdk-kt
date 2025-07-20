package com.faendir.awscdkkt.generated.services.sagemaker

import com.faendir.awscdkkt.AwsCdkDsl
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
  initializer: @AwsCdkDsl CfnMonitoringSchedule.() -> Unit = {},
): CfnMonitoringSchedule = CfnMonitoringSchedule(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnMonitoringSchedule(id: String, initializer: @AwsCdkDsl CfnMonitoringSchedule.Builder.() -> Unit = {}): CfnMonitoringSchedule = CfnMonitoringSchedule.Builder.create(this, id).apply(initializer).build()
