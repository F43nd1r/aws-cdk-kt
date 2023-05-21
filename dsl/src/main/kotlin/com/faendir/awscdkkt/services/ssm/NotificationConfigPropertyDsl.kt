package com.faendir.awscdkkt.services.ssm

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ssm.CfnMaintenanceWindowTask

@Generated
public
    fun notificationConfigProperty(initializer: CfnMaintenanceWindowTask.NotificationConfigProperty.Builder.() -> Unit
    = {}): CfnMaintenanceWindowTask.NotificationConfigProperty =
    CfnMaintenanceWindowTask.NotificationConfigProperty.builder().apply(initializer).build()
