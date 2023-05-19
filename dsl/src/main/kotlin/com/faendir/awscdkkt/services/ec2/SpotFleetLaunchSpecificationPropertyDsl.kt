@file:Generated(value = ["Generated 2023-05-19 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.ec2

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ec2.CfnSpotFleet

public
    fun spotFleetLaunchSpecificationProperty(initializer: CfnSpotFleet.SpotFleetLaunchSpecificationProperty.Builder.() -> Unit):
    CfnSpotFleet.SpotFleetLaunchSpecificationProperty =
    CfnSpotFleet.SpotFleetLaunchSpecificationProperty.builder().apply(initializer).build()
