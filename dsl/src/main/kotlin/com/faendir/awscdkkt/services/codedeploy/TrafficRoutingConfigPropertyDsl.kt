@file:Generated(value = ["Generated 2023-05-20 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.codedeploy

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.codedeploy.CfnDeploymentConfig

public
    fun trafficRoutingConfigProperty(initializer: CfnDeploymentConfig.TrafficRoutingConfigProperty.Builder.() -> Unit):
    CfnDeploymentConfig.TrafficRoutingConfigProperty =
    CfnDeploymentConfig.TrafficRoutingConfigProperty.builder().apply(initializer).build()
