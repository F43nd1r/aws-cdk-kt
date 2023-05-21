package com.faendir.awscdkkt.services.codedeploy

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.codedeploy.LambdaDeploymentGroupAttributes

@Generated
public
    fun lambdaDeploymentGroupAttributes(initializer: LambdaDeploymentGroupAttributes.Builder.() -> Unit
    = {}): LambdaDeploymentGroupAttributes =
    LambdaDeploymentGroupAttributes.builder().apply(initializer).build()
