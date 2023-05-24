package com.faendir.awscdkkt.generated.services.codedeploy

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.codedeploy.ServerDeploymentConfig
import software.amazon.awscdk.services.codedeploy.ServerDeploymentConfigProps
import software.constructs.Construct

@Generated
public fun Construct.serverDeploymentConfig(id: String, props: ServerDeploymentConfigProps):
    ServerDeploymentConfig = ServerDeploymentConfig(this, id, props)

@Generated
public fun Construct.serverDeploymentConfig(
  id: String,
  props: ServerDeploymentConfigProps,
  initializer: @AwsCdkDsl ServerDeploymentConfig.() -> Unit,
): ServerDeploymentConfig = ServerDeploymentConfig(this, id, props).apply(initializer)

@Generated
public fun Construct.buildServerDeploymentConfig(id: String, initializer: @AwsCdkDsl
    ServerDeploymentConfig.Builder.() -> Unit): ServerDeploymentConfig =
    ServerDeploymentConfig.Builder.create(this, id).apply(initializer).build()
