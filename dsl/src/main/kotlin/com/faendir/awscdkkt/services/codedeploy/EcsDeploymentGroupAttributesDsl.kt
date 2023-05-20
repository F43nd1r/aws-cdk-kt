@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.codedeploy

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.codedeploy.EcsDeploymentGroupAttributes

public
    fun ecsDeploymentGroupAttributes(initializer: EcsDeploymentGroupAttributes.Builder.() -> Unit):
    EcsDeploymentGroupAttributes = EcsDeploymentGroupAttributes.builder().apply(initializer).build()
