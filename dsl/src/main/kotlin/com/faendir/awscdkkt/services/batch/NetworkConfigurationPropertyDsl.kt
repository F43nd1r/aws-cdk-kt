package com.faendir.awscdkkt.services.batch

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.batch.CfnJobDefinition

@Generated
public
    fun networkConfigurationProperty(initializer: CfnJobDefinition.NetworkConfigurationProperty.Builder.() -> Unit
    = {}): CfnJobDefinition.NetworkConfigurationProperty =
    CfnJobDefinition.NetworkConfigurationProperty.builder().apply(initializer).build()
