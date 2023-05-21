package com.faendir.awscdkkt.services.events

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.events.CfnConnection

@Generated
public
    fun basicAuthParametersProperty(initializer: CfnConnection.BasicAuthParametersProperty.Builder.() -> Unit
    = {}): CfnConnection.BasicAuthParametersProperty =
    CfnConnection.BasicAuthParametersProperty.builder().apply(initializer).build()
