package com.faendir.awscdkkt.services.pipes

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.pipes.CfnPipe

@Generated
public
    fun networkConfigurationProperty(initializer: CfnPipe.NetworkConfigurationProperty.Builder.() -> Unit
    = {}): CfnPipe.NetworkConfigurationProperty =
    CfnPipe.NetworkConfigurationProperty.builder().apply(initializer).build()
