@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.eks

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.eks.CfnCluster

public
    fun controlPlanePlacementProperty(initializer: CfnCluster.ControlPlanePlacementProperty.Builder.() -> Unit):
    CfnCluster.ControlPlanePlacementProperty =
    CfnCluster.ControlPlanePlacementProperty.builder().apply(initializer).build()
