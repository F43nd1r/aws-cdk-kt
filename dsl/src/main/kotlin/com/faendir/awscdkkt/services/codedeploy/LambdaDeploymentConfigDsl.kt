@file:Generated(value = ["Generated 2023-05-19 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.codedeploy

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.codedeploy.LambdaDeploymentConfig
import software.amazon.awscdk.services.codedeploy.LambdaDeploymentConfigProps
import software.constructs.Construct

public fun Construct.lambdaDeploymentConfig(id: String,
    initializer: LambdaDeploymentConfig.() -> Unit = {}): LambdaDeploymentConfig =
    LambdaDeploymentConfig(this, id).apply(initializer)

public fun Construct.lambdaDeploymentConfig(
  id: String,
  props: LambdaDeploymentConfigProps,
  initializer: LambdaDeploymentConfig.() -> Unit = {},
): LambdaDeploymentConfig = LambdaDeploymentConfig(this, id, props).apply(initializer)
