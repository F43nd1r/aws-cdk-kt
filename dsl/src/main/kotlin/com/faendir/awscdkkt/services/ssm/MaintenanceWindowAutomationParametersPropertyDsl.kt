package com.faendir.awscdkkt.services.ssm

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ssm.CfnMaintenanceWindowTask

@Generated
public
    fun maintenanceWindowAutomationParametersProperty(initializer: CfnMaintenanceWindowTask.MaintenanceWindowAutomationParametersProperty.Builder.() -> Unit
    = {}): CfnMaintenanceWindowTask.MaintenanceWindowAutomationParametersProperty =
    CfnMaintenanceWindowTask.MaintenanceWindowAutomationParametersProperty.builder().apply(initializer).build()
