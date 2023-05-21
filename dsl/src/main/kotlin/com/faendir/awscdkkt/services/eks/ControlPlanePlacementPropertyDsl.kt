package com.faendir.awscdkkt.services.eks

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.eks.CfnCluster

@Generated
public
    fun controlPlanePlacementProperty(initializer: CfnCluster.ControlPlanePlacementProperty.Builder.() -> Unit
    = {}): CfnCluster.ControlPlanePlacementProperty =
    CfnCluster.ControlPlanePlacementProperty.builder().apply(initializer).build()
