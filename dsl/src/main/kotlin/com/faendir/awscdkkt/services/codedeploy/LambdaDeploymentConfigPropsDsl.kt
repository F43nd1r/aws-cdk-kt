package com.faendir.awscdkkt.services.codedeploy

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.codedeploy.LambdaDeploymentConfigProps

@Generated
public fun lambdaDeploymentConfigProps(initializer: LambdaDeploymentConfigProps.Builder.() -> Unit =
    {}): LambdaDeploymentConfigProps =
    LambdaDeploymentConfigProps.builder().apply(initializer).build()
