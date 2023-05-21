package com.faendir.awscdkkt.services.events

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.events.CfnConnection

@Generated
public
    fun apiKeyAuthParametersProperty(initializer: CfnConnection.ApiKeyAuthParametersProperty.Builder.() -> Unit
    = {}): CfnConnection.ApiKeyAuthParametersProperty =
    CfnConnection.ApiKeyAuthParametersProperty.builder().apply(initializer).build()
