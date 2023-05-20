@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.codedeploy

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.codedeploy.CfnDeploymentGroup

public
    fun trafficRouteProperty(initializer: CfnDeploymentGroup.TrafficRouteProperty.Builder.() -> Unit):
    CfnDeploymentGroup.TrafficRouteProperty =
    CfnDeploymentGroup.TrafficRouteProperty.builder().apply(initializer).build()
