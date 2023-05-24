package com.faendir.awscdkkt.generated.services.appconfig

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.appconfig.CfnDeploymentStrategy
import software.amazon.awscdk.services.appconfig.CfnDeploymentStrategyProps
import software.constructs.Construct

@Generated
public fun Construct.cfnDeploymentStrategy(id: String, props: CfnDeploymentStrategyProps):
    CfnDeploymentStrategy = CfnDeploymentStrategy(this, id, props)

@Generated
public fun Construct.cfnDeploymentStrategy(
  id: String,
  props: CfnDeploymentStrategyProps,
  initializer: @AwsCdkDsl CfnDeploymentStrategy.() -> Unit,
): CfnDeploymentStrategy = CfnDeploymentStrategy(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnDeploymentStrategy(id: String, initializer: @AwsCdkDsl
    CfnDeploymentStrategy.Builder.() -> Unit): CfnDeploymentStrategy =
    CfnDeploymentStrategy.Builder.create(this, id).apply(initializer).build()
