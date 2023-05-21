package com.faendir.awscdkkt.services.ecs

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ecs.DeploymentCircuitBreaker

@Generated
public fun deploymentCircuitBreaker(initializer: DeploymentCircuitBreaker.Builder.() -> Unit = {}):
    DeploymentCircuitBreaker = DeploymentCircuitBreaker.builder().apply(initializer).build()
