package com.faendir.awscdkkt

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.CfnStackSet

@Generated
public
    fun deploymentTargetsProperty(initializer: CfnStackSet.DeploymentTargetsProperty.Builder.() -> Unit
    = {}): CfnStackSet.DeploymentTargetsProperty =
    CfnStackSet.DeploymentTargetsProperty.builder().apply(initializer).build()
