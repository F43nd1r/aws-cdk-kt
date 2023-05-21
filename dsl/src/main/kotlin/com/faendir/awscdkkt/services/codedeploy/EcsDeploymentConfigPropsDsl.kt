package com.faendir.awscdkkt.services.codedeploy

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.codedeploy.EcsDeploymentConfigProps

@Generated
public fun ecsDeploymentConfigProps(initializer: EcsDeploymentConfigProps.Builder.() -> Unit = {}):
    EcsDeploymentConfigProps = EcsDeploymentConfigProps.builder().apply(initializer).build()
