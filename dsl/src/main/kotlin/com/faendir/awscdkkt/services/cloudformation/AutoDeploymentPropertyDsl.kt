@file:Generated(value = ["Generated 2023-05-20 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.cloudformation

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.cloudformation.CfnStackSet

public
    fun autoDeploymentProperty(initializer: CfnStackSet.AutoDeploymentProperty.Builder.() -> Unit):
    CfnStackSet.AutoDeploymentProperty =
    CfnStackSet.AutoDeploymentProperty.builder().apply(initializer).build()
