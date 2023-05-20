@file:Generated(value = ["Generated 2023-05-20 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.pipes

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.pipes.CfnPipe

public
    fun networkConfigurationProperty(initializer: CfnPipe.NetworkConfigurationProperty.Builder.() -> Unit):
    CfnPipe.NetworkConfigurationProperty =
    CfnPipe.NetworkConfigurationProperty.builder().apply(initializer).build()
