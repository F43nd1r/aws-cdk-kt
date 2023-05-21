package com.faendir.awscdkkt.services.ecs

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ecs.DeploymentController

@Generated
public fun deploymentController(initializer: DeploymentController.Builder.() -> Unit = {}):
    DeploymentController = DeploymentController.builder().apply(initializer).build()
