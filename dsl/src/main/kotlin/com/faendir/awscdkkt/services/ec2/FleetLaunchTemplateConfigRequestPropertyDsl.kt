package com.faendir.awscdkkt.services.ec2

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ec2.CfnEC2Fleet

@Generated
public
    fun fleetLaunchTemplateConfigRequestProperty(initializer: CfnEC2Fleet.FleetLaunchTemplateConfigRequestProperty.Builder.() -> Unit
    = {}): CfnEC2Fleet.FleetLaunchTemplateConfigRequestProperty =
    CfnEC2Fleet.FleetLaunchTemplateConfigRequestProperty.builder().apply(initializer).build()
