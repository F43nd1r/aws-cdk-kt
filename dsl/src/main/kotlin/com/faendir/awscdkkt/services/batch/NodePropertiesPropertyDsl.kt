package com.faendir.awscdkkt.services.batch

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.batch.CfnJobDefinition

@Generated
public
    fun nodePropertiesProperty(initializer: CfnJobDefinition.NodePropertiesProperty.Builder.() -> Unit
    = {}): CfnJobDefinition.NodePropertiesProperty =
    CfnJobDefinition.NodePropertiesProperty.builder().apply(initializer).build()
