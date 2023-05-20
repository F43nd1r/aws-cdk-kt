@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.ec2

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ec2.CfnSpotFleet

public
    fun spotFleetLaunchSpecificationProperty(initializer: CfnSpotFleet.SpotFleetLaunchSpecificationProperty.Builder.() -> Unit):
    CfnSpotFleet.SpotFleetLaunchSpecificationProperty =
    CfnSpotFleet.SpotFleetLaunchSpecificationProperty.builder().apply(initializer).build()
