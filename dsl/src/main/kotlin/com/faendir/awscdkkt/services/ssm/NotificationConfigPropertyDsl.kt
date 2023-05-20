@file:Generated(value = ["Generated 2023-05-20 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.ssm

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ssm.CfnMaintenanceWindowTask

public
    fun notificationConfigProperty(initializer: CfnMaintenanceWindowTask.NotificationConfigProperty.Builder.() -> Unit):
    CfnMaintenanceWindowTask.NotificationConfigProperty =
    CfnMaintenanceWindowTask.NotificationConfigProperty.builder().apply(initializer).build()
