package com.faendir.awscdkkt.services.sagemaker

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.sagemaker.CfnEndpoint

@Generated
public
    fun deploymentConfigProperty(initializer: CfnEndpoint.DeploymentConfigProperty.Builder.() -> Unit
    = {}): CfnEndpoint.DeploymentConfigProperty =
    CfnEndpoint.DeploymentConfigProperty.builder().apply(initializer).build()
