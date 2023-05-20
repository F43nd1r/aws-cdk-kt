@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.ec2

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ec2.CfnSpotFleet

public
    fun spotMaintenanceStrategiesProperty(initializer: CfnSpotFleet.SpotMaintenanceStrategiesProperty.Builder.() -> Unit):
    CfnSpotFleet.SpotMaintenanceStrategiesProperty =
    CfnSpotFleet.SpotMaintenanceStrategiesProperty.builder().apply(initializer).build()
