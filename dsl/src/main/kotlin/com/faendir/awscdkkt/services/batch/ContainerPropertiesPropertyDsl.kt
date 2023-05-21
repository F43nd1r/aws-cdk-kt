package com.faendir.awscdkkt.services.batch

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.batch.CfnJobDefinition

@Generated
public
    fun containerPropertiesProperty(initializer: CfnJobDefinition.ContainerPropertiesProperty.Builder.() -> Unit
    = {}): CfnJobDefinition.ContainerPropertiesProperty =
    CfnJobDefinition.ContainerPropertiesProperty.builder().apply(initializer).build()
