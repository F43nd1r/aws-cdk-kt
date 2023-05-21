package com.faendir.awscdkkt.services.amazonmq

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.amazonmq.CfnBroker

@Generated
public
    fun maintenanceWindowProperty(initializer: CfnBroker.MaintenanceWindowProperty.Builder.() -> Unit
    = {}): CfnBroker.MaintenanceWindowProperty =
    CfnBroker.MaintenanceWindowProperty.builder().apply(initializer).build()
