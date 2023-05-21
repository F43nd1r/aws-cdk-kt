package com.faendir.awscdkkt.services.ecs

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ecs.CfnTaskDefinition

@Generated
public
    fun eFSVolumeConfigurationProperty(initializer: CfnTaskDefinition.EFSVolumeConfigurationProperty.Builder.() -> Unit
    = {}): CfnTaskDefinition.EFSVolumeConfigurationProperty =
    CfnTaskDefinition.EFSVolumeConfigurationProperty.builder().apply(initializer).build()
