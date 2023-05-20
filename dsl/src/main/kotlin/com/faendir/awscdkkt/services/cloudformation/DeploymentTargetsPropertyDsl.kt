@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.cloudformation

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.cloudformation.CfnStackSet

public
    fun deploymentTargetsProperty(initializer: CfnStackSet.DeploymentTargetsProperty.Builder.() -> Unit):
    CfnStackSet.DeploymentTargetsProperty =
    CfnStackSet.DeploymentTargetsProperty.builder().apply(initializer).build()
