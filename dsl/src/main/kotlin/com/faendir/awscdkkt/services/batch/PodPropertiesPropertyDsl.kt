package com.faendir.awscdkkt.services.batch

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.batch.CfnJobDefinition

@Generated
public
    fun podPropertiesProperty(initializer: CfnJobDefinition.PodPropertiesProperty.Builder.() -> Unit
    = {}): CfnJobDefinition.PodPropertiesProperty =
    CfnJobDefinition.PodPropertiesProperty.builder().apply(initializer).build()
