@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.ssm

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.ssm.CfnMaintenanceWindowTask
import software.amazon.awscdk.services.ssm.CfnMaintenanceWindowTaskProps
import software.constructs.Construct

public fun Construct.cfnMaintenanceWindowTask(
  id: String,
  props: CfnMaintenanceWindowTaskProps,
  initializer: CfnMaintenanceWindowTask.() -> Unit = {},
): CfnMaintenanceWindowTask = CfnMaintenanceWindowTask(this, id, props).apply(initializer)
