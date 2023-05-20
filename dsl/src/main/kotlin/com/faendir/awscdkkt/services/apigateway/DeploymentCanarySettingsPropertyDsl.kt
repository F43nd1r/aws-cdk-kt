@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.apigateway

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.apigateway.CfnDeployment

public
    fun deploymentCanarySettingsProperty(initializer: CfnDeployment.DeploymentCanarySettingsProperty.Builder.() -> Unit):
    CfnDeployment.DeploymentCanarySettingsProperty =
    CfnDeployment.DeploymentCanarySettingsProperty.builder().apply(initializer).build()
