package com.faendir.awscdkkt.services.codedeploy

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.codedeploy.ServerDeploymentGroupAttributes

@Generated
public
    fun serverDeploymentGroupAttributes(initializer: ServerDeploymentGroupAttributes.Builder.() -> Unit
    = {}): ServerDeploymentGroupAttributes =
    ServerDeploymentGroupAttributes.builder().apply(initializer).build()
