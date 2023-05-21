package com.faendir.awscdkkt.services.iot

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.iot.CfnJobTemplate

@Generated
public
    fun maintenanceWindowProperty(initializer: CfnJobTemplate.MaintenanceWindowProperty.Builder.() -> Unit
    = {}): CfnJobTemplate.MaintenanceWindowProperty =
    CfnJobTemplate.MaintenanceWindowProperty.builder().apply(initializer).build()
