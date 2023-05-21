package com.faendir.awscdkkt.services.ec2

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ec2.CfnSpotFleet

@Generated
public fun spotPlacementProperty(initializer: CfnSpotFleet.SpotPlacementProperty.Builder.() -> Unit
    = {}): CfnSpotFleet.SpotPlacementProperty =
    CfnSpotFleet.SpotPlacementProperty.builder().apply(initializer).build()
