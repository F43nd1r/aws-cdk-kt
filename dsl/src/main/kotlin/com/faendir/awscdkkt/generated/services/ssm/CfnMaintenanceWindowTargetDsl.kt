package com.faendir.awscdkkt.generated.services.ssm

import com.faendir.awscdkkt.AwsCdkDsl
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
  initializer: @AwsCdkDsl CfnMaintenanceWindowTarget.() -> Unit = {},
): CfnMaintenanceWindowTarget = CfnMaintenanceWindowTarget(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnMaintenanceWindowTarget(id: String, initializer: @AwsCdkDsl CfnMaintenanceWindowTarget.Builder.() -> Unit = {}): CfnMaintenanceWindowTarget = CfnMaintenanceWindowTarget.Builder.create(this, id).apply(initializer).build()
