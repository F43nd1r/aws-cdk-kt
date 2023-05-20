@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.ssm

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ssm.CfnMaintenanceWindowTask

public
    fun loggingInfoProperty(initializer: CfnMaintenanceWindowTask.LoggingInfoProperty.Builder.() -> Unit):
    CfnMaintenanceWindowTask.LoggingInfoProperty =
    CfnMaintenanceWindowTask.LoggingInfoProperty.builder().apply(initializer).build()
