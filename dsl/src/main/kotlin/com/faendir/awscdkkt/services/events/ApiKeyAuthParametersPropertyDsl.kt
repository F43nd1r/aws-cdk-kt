@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.events

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.events.CfnConnection

public
    fun apiKeyAuthParametersProperty(initializer: CfnConnection.ApiKeyAuthParametersProperty.Builder.() -> Unit):
    CfnConnection.ApiKeyAuthParametersProperty =
    CfnConnection.ApiKeyAuthParametersProperty.builder().apply(initializer).build()
