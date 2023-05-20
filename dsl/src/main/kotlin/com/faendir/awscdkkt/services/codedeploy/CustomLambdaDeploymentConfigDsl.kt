@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.codedeploy

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.codedeploy.CustomLambdaDeploymentConfig
import software.amazon.awscdk.services.codedeploy.CustomLambdaDeploymentConfigProps
import software.constructs.Construct

public fun Construct.customLambdaDeploymentConfig(
  id: String,
  props: CustomLambdaDeploymentConfigProps,
  initializer: CustomLambdaDeploymentConfig.() -> Unit = {},
): CustomLambdaDeploymentConfig = CustomLambdaDeploymentConfig(this, id, props).apply(initializer)
