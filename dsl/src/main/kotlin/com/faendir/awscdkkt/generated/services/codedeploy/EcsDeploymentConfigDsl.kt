package com.faendir.awscdkkt.generated.services.codedeploy

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.codedeploy.EcsDeploymentConfig
import software.amazon.awscdk.services.codedeploy.EcsDeploymentConfigProps
import software.constructs.Construct

@Generated
public fun Construct.ecsDeploymentConfig(id: String, initializer: @AwsCdkDsl
    EcsDeploymentConfig.() -> Unit = {}): EcsDeploymentConfig = EcsDeploymentConfig(this,
    id).apply(initializer)

@Generated
public fun Construct.ecsDeploymentConfig(
  id: String,
  props: EcsDeploymentConfigProps,
  initializer: @AwsCdkDsl EcsDeploymentConfig.() -> Unit = {},
): EcsDeploymentConfig = EcsDeploymentConfig(this, id, props).apply(initializer)

@Generated
public fun Construct.buildEcsDeploymentConfig(id: String, initializer: @AwsCdkDsl
    EcsDeploymentConfig.Builder.() -> Unit = {}): EcsDeploymentConfig =
    EcsDeploymentConfig.Builder.create(this, id).apply(initializer).build()
