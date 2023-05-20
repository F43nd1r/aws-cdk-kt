@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.pipes

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.pipes.CfnPipe

public
    fun networkConfigurationProperty(initializer: CfnPipe.NetworkConfigurationProperty.Builder.() -> Unit):
    CfnPipe.NetworkConfigurationProperty =
    CfnPipe.NetworkConfigurationProperty.builder().apply(initializer).build()
