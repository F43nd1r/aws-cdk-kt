package com.faendir.awscdkkt.services.apigateway

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.apigateway.CfnDeployment

@Generated
public
    fun deploymentCanarySettingsProperty(initializer: CfnDeployment.DeploymentCanarySettingsProperty.Builder.() -> Unit
    = {}): CfnDeployment.DeploymentCanarySettingsProperty =
    CfnDeployment.DeploymentCanarySettingsProperty.builder().apply(initializer).build()
