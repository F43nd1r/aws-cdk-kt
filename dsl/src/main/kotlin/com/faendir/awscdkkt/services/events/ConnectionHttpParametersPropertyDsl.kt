@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.events

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.events.CfnConnection

public
    fun connectionHttpParametersProperty(initializer: CfnConnection.ConnectionHttpParametersProperty.Builder.() -> Unit):
    CfnConnection.ConnectionHttpParametersProperty =
    CfnConnection.ConnectionHttpParametersProperty.builder().apply(initializer).build()
