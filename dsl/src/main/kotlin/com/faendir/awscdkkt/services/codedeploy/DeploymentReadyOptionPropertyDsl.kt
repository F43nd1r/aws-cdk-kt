@file:Generated(value = ["Generated 2023-05-20 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.codedeploy

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.codedeploy.CfnDeploymentGroup

public
    fun deploymentReadyOptionProperty(initializer: CfnDeploymentGroup.DeploymentReadyOptionProperty.Builder.() -> Unit):
    CfnDeploymentGroup.DeploymentReadyOptionProperty =
    CfnDeploymentGroup.DeploymentReadyOptionProperty.builder().apply(initializer).build()
