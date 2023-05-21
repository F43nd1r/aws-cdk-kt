package com.faendir.awscdkkt.services.ssm

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ssm.CfnMaintenanceWindowTask

@Generated
public fun targetProperty(initializer: CfnMaintenanceWindowTask.TargetProperty.Builder.() -> Unit =
    {}): CfnMaintenanceWindowTask.TargetProperty =
    CfnMaintenanceWindowTask.TargetProperty.builder().apply(initializer).build()
