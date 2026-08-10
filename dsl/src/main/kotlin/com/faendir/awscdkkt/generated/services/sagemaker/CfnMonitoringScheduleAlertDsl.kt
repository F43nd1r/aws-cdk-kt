package com.faendir.awscdkkt.generated.services.sagemaker

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.sagemaker.CfnMonitoringScheduleAlert
import software.amazon.awscdk.services.sagemaker.CfnMonitoringScheduleAlertProps
import software.constructs.Construct

@Generated
public fun Construct.cfnMonitoringScheduleAlert(
  id: String,
  props: CfnMonitoringScheduleAlertProps,
  initializer: @AwsCdkDsl CfnMonitoringScheduleAlert.() -> Unit = {},
): CfnMonitoringScheduleAlert = CfnMonitoringScheduleAlert(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnMonitoringScheduleAlert(id: String, initializer: @AwsCdkDsl CfnMonitoringScheduleAlert.Builder.() -> Unit = {}): CfnMonitoringScheduleAlert = CfnMonitoringScheduleAlert.Builder.create(this, id).apply(initializer).build()
