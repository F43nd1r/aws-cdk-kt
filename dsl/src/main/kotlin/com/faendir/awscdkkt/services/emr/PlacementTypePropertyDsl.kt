package com.faendir.awscdkkt.services.emr

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.emr.CfnCluster

@Generated
public fun placementTypeProperty(initializer: CfnCluster.PlacementTypeProperty.Builder.() -> Unit =
    {}): CfnCluster.PlacementTypeProperty =
    CfnCluster.PlacementTypeProperty.builder().apply(initializer).build()
