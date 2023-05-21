package com.faendir.awscdkkt.services.ec2

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ec2.CfnSpotFleet

@Generated
public
    fun spotFleetTagSpecificationProperty(initializer: CfnSpotFleet.SpotFleetTagSpecificationProperty.Builder.() -> Unit
    = {}): CfnSpotFleet.SpotFleetTagSpecificationProperty =
    CfnSpotFleet.SpotFleetTagSpecificationProperty.builder().apply(initializer).build()
