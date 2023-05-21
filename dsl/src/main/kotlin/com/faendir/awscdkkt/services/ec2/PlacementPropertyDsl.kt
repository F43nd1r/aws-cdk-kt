package com.faendir.awscdkkt.services.ec2

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ec2.CfnLaunchTemplate

@Generated
public fun placementProperty(initializer: CfnLaunchTemplate.PlacementProperty.Builder.() -> Unit =
    {}): CfnLaunchTemplate.PlacementProperty =
    CfnLaunchTemplate.PlacementProperty.builder().apply(initializer).build()
