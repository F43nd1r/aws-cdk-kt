@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.codedeploy

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.codedeploy.CfnDeploymentConfig

public
    fun timeBasedCanaryProperty(initializer: CfnDeploymentConfig.TimeBasedCanaryProperty.Builder.() -> Unit):
    CfnDeploymentConfig.TimeBasedCanaryProperty =
    CfnDeploymentConfig.TimeBasedCanaryProperty.builder().apply(initializer).build()
