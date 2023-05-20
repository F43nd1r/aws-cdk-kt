@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.ec2

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ec2.CfnSpotFleet

public
    fun spotFleetTagSpecificationProperty(initializer: CfnSpotFleet.SpotFleetTagSpecificationProperty.Builder.() -> Unit):
    CfnSpotFleet.SpotFleetTagSpecificationProperty =
    CfnSpotFleet.SpotFleetTagSpecificationProperty.builder().apply(initializer).build()
