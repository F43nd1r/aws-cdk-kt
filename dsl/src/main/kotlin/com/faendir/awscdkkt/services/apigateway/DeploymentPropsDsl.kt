package com.faendir.awscdkkt.services.apigateway

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.apigateway.DeploymentProps

@Generated
public fun deploymentProps(initializer: DeploymentProps.Builder.() -> Unit = {}): DeploymentProps =
    DeploymentProps.builder().apply(initializer).build()
