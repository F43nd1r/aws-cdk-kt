@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.codedeploy

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.codedeploy.CfnDeploymentGroup

public
    fun deploymentStyleProperty(initializer: CfnDeploymentGroup.DeploymentStyleProperty.Builder.() -> Unit):
    CfnDeploymentGroup.DeploymentStyleProperty =
    CfnDeploymentGroup.DeploymentStyleProperty.builder().apply(initializer).build()
