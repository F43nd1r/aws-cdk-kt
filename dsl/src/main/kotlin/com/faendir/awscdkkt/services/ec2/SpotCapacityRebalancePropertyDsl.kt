package com.faendir.awscdkkt.services.ec2

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ec2.CfnSpotFleet

@Generated
public
    fun spotCapacityRebalanceProperty(initializer: CfnSpotFleet.SpotCapacityRebalanceProperty.Builder.() -> Unit
    = {}): CfnSpotFleet.SpotCapacityRebalanceProperty =
    CfnSpotFleet.SpotCapacityRebalanceProperty.builder().apply(initializer).build()
