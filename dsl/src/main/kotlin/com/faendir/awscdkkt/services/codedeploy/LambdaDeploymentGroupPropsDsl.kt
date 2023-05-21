package com.faendir.awscdkkt.services.codedeploy

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.codedeploy.LambdaDeploymentGroupProps

@Generated
public fun lambdaDeploymentGroupProps(initializer: LambdaDeploymentGroupProps.Builder.() -> Unit =
    {}): LambdaDeploymentGroupProps =
    LambdaDeploymentGroupProps.builder().apply(initializer).build()
