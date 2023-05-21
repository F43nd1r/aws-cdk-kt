package com.faendir.awscdkkt.services.s3.deployment

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.s3.deployment.DeploymentSourceContext

@Generated
public fun deploymentSourceContext(initializer: DeploymentSourceContext.Builder.() -> Unit = {}):
    DeploymentSourceContext = DeploymentSourceContext.builder().apply(initializer).build()
