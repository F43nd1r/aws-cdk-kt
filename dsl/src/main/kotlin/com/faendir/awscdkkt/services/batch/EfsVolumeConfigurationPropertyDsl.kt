package com.faendir.awscdkkt.services.batch

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.batch.CfnJobDefinition

@Generated
public
    fun efsVolumeConfigurationProperty(initializer: CfnJobDefinition.EfsVolumeConfigurationProperty.Builder.() -> Unit
    = {}): CfnJobDefinition.EfsVolumeConfigurationProperty =
    CfnJobDefinition.EfsVolumeConfigurationProperty.builder().apply(initializer).build()
