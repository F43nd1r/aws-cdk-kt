@file:Generated(value = ["Generated 2023-05-19 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.ec2

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ec2.CfnEC2Fleet

public
    fun maintenanceStrategiesProperty(initializer: CfnEC2Fleet.MaintenanceStrategiesProperty.Builder.() -> Unit):
    CfnEC2Fleet.MaintenanceStrategiesProperty =
    CfnEC2Fleet.MaintenanceStrategiesProperty.builder().apply(initializer).build()
