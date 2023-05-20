@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.codedeploy

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.codedeploy.ServerDeploymentConfig
import software.amazon.awscdk.services.codedeploy.ServerDeploymentConfigProps
import software.constructs.Construct

public fun Construct.serverDeploymentConfig(
  id: String,
  props: ServerDeploymentConfigProps,
  initializer: ServerDeploymentConfig.() -> Unit = {},
): ServerDeploymentConfig = ServerDeploymentConfig(this, id, props).apply(initializer)
