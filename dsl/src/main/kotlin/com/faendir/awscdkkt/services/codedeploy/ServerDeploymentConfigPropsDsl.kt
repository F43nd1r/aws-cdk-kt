package com.faendir.awscdkkt.services.codedeploy

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.codedeploy.ServerDeploymentConfigProps

@Generated
public fun serverDeploymentConfigProps(initializer: ServerDeploymentConfigProps.Builder.() -> Unit =
    {}): ServerDeploymentConfigProps =
    ServerDeploymentConfigProps.builder().apply(initializer).build()
