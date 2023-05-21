package com.faendir.awscdkkt.services.ssm

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ssm.CfnMaintenanceWindowTask

@Generated
public
    fun maintenanceWindowRunCommandParametersProperty(initializer: CfnMaintenanceWindowTask.MaintenanceWindowRunCommandParametersProperty.Builder.() -> Unit
    = {}): CfnMaintenanceWindowTask.MaintenanceWindowRunCommandParametersProperty =
    CfnMaintenanceWindowTask.MaintenanceWindowRunCommandParametersProperty.builder().apply(initializer).build()
