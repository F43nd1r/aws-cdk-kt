package com.faendir.awscdkkt.services.appconfig

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.appconfig.CfnDeploymentStrategy
import software.amazon.awscdk.services.appconfig.CfnDeploymentStrategyProps
import software.constructs.Construct

@Generated
public fun Construct.cfnDeploymentStrategy(
  id: String,
  props: CfnDeploymentStrategyProps,
  initializer: CfnDeploymentStrategy.() -> Unit = {},
): CfnDeploymentStrategy = CfnDeploymentStrategy(this, id, props).apply(initializer)
