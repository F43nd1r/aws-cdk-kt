@file:Suppress("DEPRECATION")

package com.faendir.awscdkkt.generated.services.codedeploy

import com.faendir.awscdkkt.AwsCdkDsl
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
public fun Construct.customLambdaDeploymentConfig(id: String,
    props: CustomLambdaDeploymentConfigProps): CustomLambdaDeploymentConfig =
    CustomLambdaDeploymentConfig(this, id, props)

@Deprecated(message =
    "software.amazon.awscdk.services.codedeploy.CustomLambdaDeploymentConfig is deprecated in CDK.")
@Generated
public fun Construct.customLambdaDeploymentConfig(
  id: String,
  props: CustomLambdaDeploymentConfigProps,
  initializer: @AwsCdkDsl CustomLambdaDeploymentConfig.() -> Unit,
): CustomLambdaDeploymentConfig = CustomLambdaDeploymentConfig(this, id, props).apply(initializer)

@Deprecated(message =
    "software.amazon.awscdk.services.codedeploy.CustomLambdaDeploymentConfig is deprecated in CDK.")
@Generated
public fun Construct.buildCustomLambdaDeploymentConfig(id: String, initializer: @AwsCdkDsl
    CustomLambdaDeploymentConfig.Builder.() -> Unit): CustomLambdaDeploymentConfig =
    CustomLambdaDeploymentConfig.Builder.create(this, id).apply(initializer).build()
