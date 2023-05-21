package com.faendir.awscdkkt.services.codedeploy

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.codedeploy.CfnDeploymentGroup

@Generated
public fun deploymentProperty(initializer: CfnDeploymentGroup.DeploymentProperty.Builder.() -> Unit
    = {}): CfnDeploymentGroup.DeploymentProperty =
    CfnDeploymentGroup.DeploymentProperty.builder().apply(initializer).build()
