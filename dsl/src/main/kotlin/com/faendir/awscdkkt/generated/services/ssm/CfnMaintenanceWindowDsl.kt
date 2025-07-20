package com.faendir.awscdkkt.generated.services.ssm

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.ssm.CfnMaintenanceWindow
import software.amazon.awscdk.services.ssm.CfnMaintenanceWindowProps
import software.constructs.Construct

@Generated
public fun Construct.cfnMaintenanceWindow(
  id: String,
  props: CfnMaintenanceWindowProps,
  initializer: @AwsCdkDsl CfnMaintenanceWindow.() -> Unit = {},
): CfnMaintenanceWindow = CfnMaintenanceWindow(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnMaintenanceWindow(id: String, initializer: @AwsCdkDsl CfnMaintenanceWindow.Builder.() -> Unit = {}): CfnMaintenanceWindow = CfnMaintenanceWindow.Builder.create(this, id).apply(initializer).build()
