package com.faendir.awscdkkt.services.apigateway

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.apigateway.MethodDeploymentOptions

@Generated
public fun methodDeploymentOptions(initializer: MethodDeploymentOptions.Builder.() -> Unit = {}):
    MethodDeploymentOptions = MethodDeploymentOptions.builder().apply(initializer).build()
