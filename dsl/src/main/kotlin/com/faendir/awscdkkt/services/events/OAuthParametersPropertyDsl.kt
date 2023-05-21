package com.faendir.awscdkkt.services.events

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.events.CfnConnection

@Generated
public
    fun oAuthParametersProperty(initializer: CfnConnection.OAuthParametersProperty.Builder.() -> Unit
    = {}): CfnConnection.OAuthParametersProperty =
    CfnConnection.OAuthParametersProperty.builder().apply(initializer).build()
