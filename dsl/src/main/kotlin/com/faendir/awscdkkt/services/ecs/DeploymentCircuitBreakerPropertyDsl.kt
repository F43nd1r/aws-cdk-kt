package com.faendir.awscdkkt.services.ecs

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ecs.CfnService

@Generated
public
    fun deploymentCircuitBreakerProperty(initializer: CfnService.DeploymentCircuitBreakerProperty.Builder.() -> Unit
    = {}): CfnService.DeploymentCircuitBreakerProperty =
    CfnService.DeploymentCircuitBreakerProperty.builder().apply(initializer).build()
