package com.faendir.awscdkkt.services.batch

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.batch.CfnJobDefinition

@Generated
public
    fun eksPropertiesProperty(initializer: CfnJobDefinition.EksPropertiesProperty.Builder.() -> Unit
    = {}): CfnJobDefinition.EksPropertiesProperty =
    CfnJobDefinition.EksPropertiesProperty.builder().apply(initializer).build()
