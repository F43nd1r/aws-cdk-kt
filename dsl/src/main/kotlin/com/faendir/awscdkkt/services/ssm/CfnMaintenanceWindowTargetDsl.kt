package com.faendir.awscdkkt.services.ssm

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.ssm.CfnMaintenanceWindowTarget
import software.amazon.awscdk.services.ssm.CfnMaintenanceWindowTargetProps
import software.constructs.Construct

@Generated
public fun Construct.cfnMaintenanceWindowTarget(
  id: String,
  props: CfnMaintenanceWindowTargetProps,
  initializer: CfnMaintenanceWindowTarget.() -> Unit = {},
): CfnMaintenanceWindowTarget = CfnMaintenanceWindowTarget(this, id, props).apply(initializer)
