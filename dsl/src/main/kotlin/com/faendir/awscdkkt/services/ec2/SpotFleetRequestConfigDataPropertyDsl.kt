package com.faendir.awscdkkt.services.ec2

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ec2.CfnSpotFleet

@Generated
public
    fun spotFleetRequestConfigDataProperty(initializer: CfnSpotFleet.SpotFleetRequestConfigDataProperty.Builder.() -> Unit
    = {}): CfnSpotFleet.SpotFleetRequestConfigDataProperty =
    CfnSpotFleet.SpotFleetRequestConfigDataProperty.builder().apply(initializer).build()
