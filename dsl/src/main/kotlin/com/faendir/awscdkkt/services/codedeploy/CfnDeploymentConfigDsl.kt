@file:Generated(value = ["Generated 2023-05-19 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.codedeploy

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.codedeploy.CfnDeploymentConfig
import software.amazon.awscdk.services.codedeploy.CfnDeploymentConfigProps
import software.constructs.Construct

public fun Construct.cfnDeploymentConfig(id: String, initializer: CfnDeploymentConfig.() -> Unit =
    {}): CfnDeploymentConfig = CfnDeploymentConfig(this, id).apply(initializer)

public fun Construct.cfnDeploymentConfig(
  id: String,
  props: CfnDeploymentConfigProps,
  initializer: CfnDeploymentConfig.() -> Unit = {},
): CfnDeploymentConfig = CfnDeploymentConfig(this, id, props).apply(initializer)
