package com.faendir.awscdkkt.services.codedeploy

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.codedeploy.CfnDeploymentConfig

@Generated
public
    fun trafficRoutingConfigProperty(initializer: CfnDeploymentConfig.TrafficRoutingConfigProperty.Builder.() -> Unit
    = {}): CfnDeploymentConfig.TrafficRoutingConfigProperty =
    CfnDeploymentConfig.TrafficRoutingConfigProperty.builder().apply(initializer).build()
