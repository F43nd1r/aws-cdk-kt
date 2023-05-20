@file:Generated(value = ["Generated 2023-05-20 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.ecs

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ecs.CfnService

public
    fun deploymentConfigurationProperty(initializer: CfnService.DeploymentConfigurationProperty.Builder.() -> Unit):
    CfnService.DeploymentConfigurationProperty =
    CfnService.DeploymentConfigurationProperty.builder().apply(initializer).build()
