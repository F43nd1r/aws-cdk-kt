package com.faendir.awscdkkt.services.lightsail

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.lightsail.CfnContainer

@Generated
public
    fun containerServiceDeploymentProperty(initializer: CfnContainer.ContainerServiceDeploymentProperty.Builder.() -> Unit
    = {}): CfnContainer.ContainerServiceDeploymentProperty =
    CfnContainer.ContainerServiceDeploymentProperty.builder().apply(initializer).build()
