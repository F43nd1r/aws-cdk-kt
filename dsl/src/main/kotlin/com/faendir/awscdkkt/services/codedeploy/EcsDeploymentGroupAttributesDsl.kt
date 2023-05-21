package com.faendir.awscdkkt.services.codedeploy

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.codedeploy.EcsDeploymentGroupAttributes

@Generated
public fun ecsDeploymentGroupAttributes(initializer: EcsDeploymentGroupAttributes.Builder.() -> Unit
    = {}): EcsDeploymentGroupAttributes =
    EcsDeploymentGroupAttributes.builder().apply(initializer).build()
