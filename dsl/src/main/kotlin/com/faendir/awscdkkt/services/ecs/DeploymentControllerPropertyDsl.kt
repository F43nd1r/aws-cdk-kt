package com.faendir.awscdkkt.services.ecs

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ecs.CfnService

@Generated
public
    fun deploymentControllerProperty(initializer: CfnService.DeploymentControllerProperty.Builder.() -> Unit
    = {}): CfnService.DeploymentControllerProperty =
    CfnService.DeploymentControllerProperty.builder().apply(initializer).build()
