@file:Generated(value = ["Generated 2023-05-20 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.codedeploy

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.codedeploy.CfnDeploymentConfig

public
    fun timeBasedCanaryProperty(initializer: CfnDeploymentConfig.TimeBasedCanaryProperty.Builder.() -> Unit):
    CfnDeploymentConfig.TimeBasedCanaryProperty =
    CfnDeploymentConfig.TimeBasedCanaryProperty.builder().apply(initializer).build()
