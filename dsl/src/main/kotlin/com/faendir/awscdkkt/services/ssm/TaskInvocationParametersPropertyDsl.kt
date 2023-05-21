package com.faendir.awscdkkt.services.ssm

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ssm.CfnMaintenanceWindowTask

@Generated
public
    fun taskInvocationParametersProperty(initializer: CfnMaintenanceWindowTask.TaskInvocationParametersProperty.Builder.() -> Unit
    = {}): CfnMaintenanceWindowTask.TaskInvocationParametersProperty =
    CfnMaintenanceWindowTask.TaskInvocationParametersProperty.builder().apply(initializer).build()
