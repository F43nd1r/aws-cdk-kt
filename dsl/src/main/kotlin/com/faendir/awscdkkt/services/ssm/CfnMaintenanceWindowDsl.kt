@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.ssm

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.ssm.CfnMaintenanceWindow
import software.amazon.awscdk.services.ssm.CfnMaintenanceWindowProps
import software.constructs.Construct

public fun Construct.cfnMaintenanceWindow(
  id: String,
  props: CfnMaintenanceWindowProps,
  initializer: CfnMaintenanceWindow.() -> Unit = {},
): CfnMaintenanceWindow = CfnMaintenanceWindow(this, id, props).apply(initializer)
