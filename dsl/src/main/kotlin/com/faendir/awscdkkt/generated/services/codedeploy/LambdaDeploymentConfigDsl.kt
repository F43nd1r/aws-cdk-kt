package com.faendir.awscdkkt.generated.services.codedeploy

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.codedeploy.LambdaDeploymentConfig
import software.amazon.awscdk.services.codedeploy.LambdaDeploymentConfigProps
import software.constructs.Construct

@Generated
public fun Construct.lambdaDeploymentConfig(id: String, initializer: @AwsCdkDsl LambdaDeploymentConfig.() -> Unit = {}): LambdaDeploymentConfig = LambdaDeploymentConfig(this, id).apply(initializer)

@Generated
public fun Construct.lambdaDeploymentConfig(
  id: String,
  props: LambdaDeploymentConfigProps,
  initializer: @AwsCdkDsl LambdaDeploymentConfig.() -> Unit = {},
): LambdaDeploymentConfig = LambdaDeploymentConfig(this, id, props).apply(initializer)

@Generated
public fun Construct.buildLambdaDeploymentConfig(id: String, initializer: @AwsCdkDsl LambdaDeploymentConfig.Builder.() -> Unit = {}): LambdaDeploymentConfig = LambdaDeploymentConfig.Builder.create(this, id).apply(initializer).build()
