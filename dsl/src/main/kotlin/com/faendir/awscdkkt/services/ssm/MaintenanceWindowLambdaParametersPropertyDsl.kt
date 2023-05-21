package com.faendir.awscdkkt.services.ssm

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ssm.CfnMaintenanceWindowTask

@Generated
public
    fun maintenanceWindowLambdaParametersProperty(initializer: CfnMaintenanceWindowTask.MaintenanceWindowLambdaParametersProperty.Builder.() -> Unit
    = {}): CfnMaintenanceWindowTask.MaintenanceWindowLambdaParametersProperty =
    CfnMaintenanceWindowTask.MaintenanceWindowLambdaParametersProperty.builder().apply(initializer).build()
