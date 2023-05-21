package com.faendir.awscdkkt.services.ec2

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ec2.CfnLaunchTemplate

@Generated
public
    fun maintenanceOptionsProperty(initializer: CfnLaunchTemplate.MaintenanceOptionsProperty.Builder.() -> Unit
    = {}): CfnLaunchTemplate.MaintenanceOptionsProperty =
    CfnLaunchTemplate.MaintenanceOptionsProperty.builder().apply(initializer).build()
