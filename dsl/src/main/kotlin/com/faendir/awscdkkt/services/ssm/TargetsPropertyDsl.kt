@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.ssm

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ssm.CfnMaintenanceWindowTarget

public
    fun targetsProperty(initializer: CfnMaintenanceWindowTarget.TargetsProperty.Builder.() -> Unit):
    CfnMaintenanceWindowTarget.TargetsProperty =
    CfnMaintenanceWindowTarget.TargetsProperty.builder().apply(initializer).build()
