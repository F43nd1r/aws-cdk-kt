package com.faendir.awscdkkt.generated.services.appconfig

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.appconfig.DeploymentStrategy
import software.amazon.awscdk.services.appconfig.DeploymentStrategyProps
import software.constructs.Construct

@Generated
public fun Construct.deploymentStrategy(
  id: String,
  props: DeploymentStrategyProps,
  initializer: @AwsCdkDsl DeploymentStrategy.() -> Unit = {},
): DeploymentStrategy = DeploymentStrategy(this, id, props).apply(initializer)

@Generated
public fun Construct.buildDeploymentStrategy(id: String, initializer: @AwsCdkDsl
    DeploymentStrategy.Builder.() -> Unit = {}): DeploymentStrategy =
    DeploymentStrategy.Builder.create(this, id).apply(initializer).build()
