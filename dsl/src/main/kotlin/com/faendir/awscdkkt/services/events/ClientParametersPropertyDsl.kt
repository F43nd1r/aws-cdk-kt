@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.events

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.events.CfnConnection

public
    fun clientParametersProperty(initializer: CfnConnection.ClientParametersProperty.Builder.() -> Unit):
    CfnConnection.ClientParametersProperty =
    CfnConnection.ClientParametersProperty.builder().apply(initializer).build()
