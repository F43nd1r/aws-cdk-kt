package com.faendir.awscdkkt.services.codedeploy

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.codedeploy.CfnDeploymentConfig

@Generated
public
    fun timeBasedCanaryProperty(initializer: CfnDeploymentConfig.TimeBasedCanaryProperty.Builder.() -> Unit
    = {}): CfnDeploymentConfig.TimeBasedCanaryProperty =
    CfnDeploymentConfig.TimeBasedCanaryProperty.builder().apply(initializer).build()
