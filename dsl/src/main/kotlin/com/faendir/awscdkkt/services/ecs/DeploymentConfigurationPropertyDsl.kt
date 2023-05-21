package com.faendir.awscdkkt.services.ecs

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ecs.CfnService

@Generated
public
    fun deploymentConfigurationProperty(initializer: CfnService.DeploymentConfigurationProperty.Builder.() -> Unit
    = {}): CfnService.DeploymentConfigurationProperty =
    CfnService.DeploymentConfigurationProperty.builder().apply(initializer).build()
