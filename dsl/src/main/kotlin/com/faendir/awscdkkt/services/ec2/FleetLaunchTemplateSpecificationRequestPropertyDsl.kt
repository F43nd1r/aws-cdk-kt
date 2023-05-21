package com.faendir.awscdkkt.services.ec2

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ec2.CfnEC2Fleet

@Generated
public
    fun fleetLaunchTemplateSpecificationRequestProperty(initializer: CfnEC2Fleet.FleetLaunchTemplateSpecificationRequestProperty.Builder.() -> Unit
    = {}): CfnEC2Fleet.FleetLaunchTemplateSpecificationRequestProperty =
    CfnEC2Fleet.FleetLaunchTemplateSpecificationRequestProperty.builder().apply(initializer).build()
