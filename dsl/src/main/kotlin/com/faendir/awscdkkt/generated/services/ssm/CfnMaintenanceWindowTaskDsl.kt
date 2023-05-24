package com.faendir.awscdkkt.generated.services.ssm

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.ssm.CfnMaintenanceWindowTask
import software.amazon.awscdk.services.ssm.CfnMaintenanceWindowTaskProps
import software.constructs.Construct

@Generated
public fun Construct.cfnMaintenanceWindowTask(id: String, props: CfnMaintenanceWindowTaskProps):
    CfnMaintenanceWindowTask = CfnMaintenanceWindowTask(this, id, props)

@Generated
public fun Construct.cfnMaintenanceWindowTask(
  id: String,
  props: CfnMaintenanceWindowTaskProps,
  initializer: @AwsCdkDsl CfnMaintenanceWindowTask.() -> Unit,
): CfnMaintenanceWindowTask = CfnMaintenanceWindowTask(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnMaintenanceWindowTask(id: String, initializer: @AwsCdkDsl
    CfnMaintenanceWindowTask.Builder.() -> Unit): CfnMaintenanceWindowTask =
    CfnMaintenanceWindowTask.Builder.create(this, id).apply(initializer).build()
