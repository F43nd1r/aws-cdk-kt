package com.faendir.awscdkkt.services.codedeploy

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.codedeploy.CfnDeploymentGroup

@Generated
public
    fun deploymentStyleProperty(initializer: CfnDeploymentGroup.DeploymentStyleProperty.Builder.() -> Unit
    = {}): CfnDeploymentGroup.DeploymentStyleProperty =
    CfnDeploymentGroup.DeploymentStyleProperty.builder().apply(initializer).build()
