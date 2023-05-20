@file:Generated(value = ["Generated 2023-05-20 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.s3.deployment

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.s3.deployment.DeploymentSourceContext

public fun deploymentSourceContext(initializer: DeploymentSourceContext.Builder.() -> Unit):
    DeploymentSourceContext = DeploymentSourceContext.builder().apply(initializer).build()
