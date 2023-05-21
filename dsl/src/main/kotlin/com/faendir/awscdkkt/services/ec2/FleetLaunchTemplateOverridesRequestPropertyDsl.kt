package com.faendir.awscdkkt.services.ec2

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ec2.CfnEC2Fleet

@Generated
public
    fun fleetLaunchTemplateOverridesRequestProperty(initializer: CfnEC2Fleet.FleetLaunchTemplateOverridesRequestProperty.Builder.() -> Unit
    = {}): CfnEC2Fleet.FleetLaunchTemplateOverridesRequestProperty =
    CfnEC2Fleet.FleetLaunchTemplateOverridesRequestProperty.builder().apply(initializer).build()
