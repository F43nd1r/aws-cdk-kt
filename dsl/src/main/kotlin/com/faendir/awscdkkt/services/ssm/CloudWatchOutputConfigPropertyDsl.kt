package com.faendir.awscdkkt.services.ssm

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ssm.CfnMaintenanceWindowTask

@Generated
public
    fun cloudWatchOutputConfigProperty(initializer: CfnMaintenanceWindowTask.CloudWatchOutputConfigProperty.Builder.() -> Unit
    = {}): CfnMaintenanceWindowTask.CloudWatchOutputConfigProperty =
    CfnMaintenanceWindowTask.CloudWatchOutputConfigProperty.builder().apply(initializer).build()
