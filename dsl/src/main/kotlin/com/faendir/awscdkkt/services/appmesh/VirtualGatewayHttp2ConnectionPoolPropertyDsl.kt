@file:Generated(value = ["Generated 2023-05-19 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.appmesh

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.appmesh.CfnVirtualGateway

public
    fun virtualGatewayHttp2ConnectionPoolProperty(initializer: CfnVirtualGateway.VirtualGatewayHttp2ConnectionPoolProperty.Builder.() -> Unit):
    CfnVirtualGateway.VirtualGatewayHttp2ConnectionPoolProperty =
    CfnVirtualGateway.VirtualGatewayHttp2ConnectionPoolProperty.builder().apply(initializer).build()
