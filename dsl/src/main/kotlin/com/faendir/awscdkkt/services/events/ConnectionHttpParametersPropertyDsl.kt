package com.faendir.awscdkkt.services.events

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.events.CfnConnection

@Generated
public
    fun connectionHttpParametersProperty(initializer: CfnConnection.ConnectionHttpParametersProperty.Builder.() -> Unit
    = {}): CfnConnection.ConnectionHttpParametersProperty =
    CfnConnection.ConnectionHttpParametersProperty.builder().apply(initializer).build()
