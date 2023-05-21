package com.faendir.awscdkkt.services.cloudformation

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.cloudformation.CfnStackSet

@Generated
public fun autoDeploymentProperty(initializer: CfnStackSet.AutoDeploymentProperty.Builder.() -> Unit
    = {}): CfnStackSet.AutoDeploymentProperty =
    CfnStackSet.AutoDeploymentProperty.builder().apply(initializer).build()
