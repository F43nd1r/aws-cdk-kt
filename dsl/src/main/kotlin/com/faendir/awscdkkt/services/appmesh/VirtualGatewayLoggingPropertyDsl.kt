@file:Generated(value = ["Generated 2023-05-19 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.appmesh

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.appmesh.CfnVirtualGateway

public
    fun virtualGatewayLoggingProperty(initializer: CfnVirtualGateway.VirtualGatewayLoggingProperty.Builder.() -> Unit):
    CfnVirtualGateway.VirtualGatewayLoggingProperty =
    CfnVirtualGateway.VirtualGatewayLoggingProperty.builder().apply(initializer).build()
