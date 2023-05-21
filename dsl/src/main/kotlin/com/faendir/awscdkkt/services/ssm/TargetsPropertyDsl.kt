package com.faendir.awscdkkt.services.ssm

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ssm.CfnMaintenanceWindowTarget

@Generated
public
    fun targetsProperty(initializer: CfnMaintenanceWindowTarget.TargetsProperty.Builder.() -> Unit =
    {}): CfnMaintenanceWindowTarget.TargetsProperty =
    CfnMaintenanceWindowTarget.TargetsProperty.builder().apply(initializer).build()
