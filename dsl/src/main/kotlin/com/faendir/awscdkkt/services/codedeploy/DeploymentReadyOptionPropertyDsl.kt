package com.faendir.awscdkkt.services.codedeploy

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.codedeploy.CfnDeploymentGroup

@Generated
public
    fun deploymentReadyOptionProperty(initializer: CfnDeploymentGroup.DeploymentReadyOptionProperty.Builder.() -> Unit
    = {}): CfnDeploymentGroup.DeploymentReadyOptionProperty =
    CfnDeploymentGroup.DeploymentReadyOptionProperty.builder().apply(initializer).build()
