package com.faendir.awscdkkt.services.opsworks

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.opsworks.CfnLayer

@Generated
public
    fun shutdownEventConfigurationProperty(initializer: CfnLayer.ShutdownEventConfigurationProperty.Builder.() -> Unit
    = {}): CfnLayer.ShutdownEventConfigurationProperty =
    CfnLayer.ShutdownEventConfigurationProperty.builder().apply(initializer).build()
