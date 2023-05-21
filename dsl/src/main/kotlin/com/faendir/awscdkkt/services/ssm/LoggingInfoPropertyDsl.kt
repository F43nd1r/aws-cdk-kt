package com.faendir.awscdkkt.services.ssm

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ssm.CfnMaintenanceWindowTask

@Generated
public
    fun loggingInfoProperty(initializer: CfnMaintenanceWindowTask.LoggingInfoProperty.Builder.() -> Unit
    = {}): CfnMaintenanceWindowTask.LoggingInfoProperty =
    CfnMaintenanceWindowTask.LoggingInfoProperty.builder().apply(initializer).build()
