@file:Generated(value = ["Generated 2023-05-20 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.events

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.events.CfnConnection

public
    fun basicAuthParametersProperty(initializer: CfnConnection.BasicAuthParametersProperty.Builder.() -> Unit):
    CfnConnection.BasicAuthParametersProperty =
    CfnConnection.BasicAuthParametersProperty.builder().apply(initializer).build()
