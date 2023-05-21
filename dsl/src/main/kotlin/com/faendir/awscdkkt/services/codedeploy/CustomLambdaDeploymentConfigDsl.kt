@file:Suppress("DEPRECATION")

package com.faendir.awscdkkt.services.codedeploy

import javax.`annotation`.Generated
import kotlin.Deprecated
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import software.amazon.awscdk.services.codedeploy.CustomLambdaDeploymentConfig
import software.amazon.awscdk.services.codedeploy.CustomLambdaDeploymentConfigProps
import software.constructs.Construct

@Deprecated(message =
    "software.amazon.awscdk.services.codedeploy.CustomLambdaDeploymentConfig is deprecated in CDK.")
@Generated
public fun Construct.customLambdaDeploymentConfig(
  id: String,
  props: CustomLambdaDeploymentConfigProps,
  initializer: CustomLambdaDeploymentConfig.() -> Unit = {},
): CustomLambdaDeploymentConfig = CustomLambdaDeploymentConfig(this, id, props).apply(initializer)
