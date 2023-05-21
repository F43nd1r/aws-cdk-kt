package com.faendir.awscdkkt.services.ec2

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ec2.CfnSpotFleet

@Generated
public
    fun fleetLaunchTemplateSpecificationProperty(initializer: CfnSpotFleet.FleetLaunchTemplateSpecificationProperty.Builder.() -> Unit
    = {}): CfnSpotFleet.FleetLaunchTemplateSpecificationProperty =
    CfnSpotFleet.FleetLaunchTemplateSpecificationProperty.builder().apply(initializer).build()
