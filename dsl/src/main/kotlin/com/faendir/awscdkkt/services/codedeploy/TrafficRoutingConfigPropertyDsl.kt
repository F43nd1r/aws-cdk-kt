@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.codedeploy

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.codedeploy.CfnDeploymentConfig

public
    fun trafficRoutingConfigProperty(initializer: CfnDeploymentConfig.TrafficRoutingConfigProperty.Builder.() -> Unit):
    CfnDeploymentConfig.TrafficRoutingConfigProperty =
    CfnDeploymentConfig.TrafficRoutingConfigProperty.builder().apply(initializer).build()
