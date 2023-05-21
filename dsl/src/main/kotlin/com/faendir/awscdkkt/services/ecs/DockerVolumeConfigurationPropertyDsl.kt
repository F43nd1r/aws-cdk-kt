package com.faendir.awscdkkt.services.ecs

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ecs.CfnTaskDefinition

@Generated
public
    fun dockerVolumeConfigurationProperty(initializer: CfnTaskDefinition.DockerVolumeConfigurationProperty.Builder.() -> Unit
    = {}): CfnTaskDefinition.DockerVolumeConfigurationProperty =
    CfnTaskDefinition.DockerVolumeConfigurationProperty.builder().apply(initializer).build()
