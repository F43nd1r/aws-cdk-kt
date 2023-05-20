@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.codedeploy

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.codedeploy.EcsDeploymentConfig
import software.amazon.awscdk.services.codedeploy.EcsDeploymentConfigProps
import software.constructs.Construct

public fun Construct.ecsDeploymentConfig(id: String, initializer: EcsDeploymentConfig.() -> Unit =
    {}): EcsDeploymentConfig = EcsDeploymentConfig(this, id).apply(initializer)

public fun Construct.ecsDeploymentConfig(
  id: String,
  props: EcsDeploymentConfigProps,
  initializer: EcsDeploymentConfig.() -> Unit = {},
): EcsDeploymentConfig = EcsDeploymentConfig(this, id, props).apply(initializer)
