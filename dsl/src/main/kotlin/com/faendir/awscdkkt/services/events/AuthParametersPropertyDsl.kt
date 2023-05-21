package com.faendir.awscdkkt.services.events

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.events.CfnConnection

@Generated
public
    fun authParametersProperty(initializer: CfnConnection.AuthParametersProperty.Builder.() -> Unit
    = {}): CfnConnection.AuthParametersProperty =
    CfnConnection.AuthParametersProperty.builder().apply(initializer).build()
