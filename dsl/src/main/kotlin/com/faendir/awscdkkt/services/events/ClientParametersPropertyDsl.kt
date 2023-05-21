package com.faendir.awscdkkt.services.events

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.events.CfnConnection

@Generated
public
    fun clientParametersProperty(initializer: CfnConnection.ClientParametersProperty.Builder.() -> Unit
    = {}): CfnConnection.ClientParametersProperty =
    CfnConnection.ClientParametersProperty.builder().apply(initializer).build()
