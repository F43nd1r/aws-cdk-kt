@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.ssm

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ssm.CfnMaintenanceWindowTask

public
    fun cloudWatchOutputConfigProperty(initializer: CfnMaintenanceWindowTask.CloudWatchOutputConfigProperty.Builder.() -> Unit):
    CfnMaintenanceWindowTask.CloudWatchOutputConfigProperty =
    CfnMaintenanceWindowTask.CloudWatchOutputConfigProperty.builder().apply(initializer).build()
