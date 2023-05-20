@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.codedeploy

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.codedeploy.CfnDeploymentConfig

public
    fun minimumHealthyHostsProperty(initializer: CfnDeploymentConfig.MinimumHealthyHostsProperty.Builder.() -> Unit):
    CfnDeploymentConfig.MinimumHealthyHostsProperty =
    CfnDeploymentConfig.MinimumHealthyHostsProperty.builder().apply(initializer).build()
