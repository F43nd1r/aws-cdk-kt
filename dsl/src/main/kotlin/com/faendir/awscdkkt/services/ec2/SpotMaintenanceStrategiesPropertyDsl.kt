package com.faendir.awscdkkt.services.ec2

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ec2.CfnSpotFleet

@Generated
public
    fun spotMaintenanceStrategiesProperty(initializer: CfnSpotFleet.SpotMaintenanceStrategiesProperty.Builder.() -> Unit
    = {}): CfnSpotFleet.SpotMaintenanceStrategiesProperty =
    CfnSpotFleet.SpotMaintenanceStrategiesProperty.builder().apply(initializer).build()
