package com.faendir.awscdkkt.services.batch

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.batch.CfnJobDefinition

@Generated
public
    fun logConfigurationProperty(initializer: CfnJobDefinition.LogConfigurationProperty.Builder.() -> Unit
    = {}): CfnJobDefinition.LogConfigurationProperty =
    CfnJobDefinition.LogConfigurationProperty.builder().apply(initializer).build()
