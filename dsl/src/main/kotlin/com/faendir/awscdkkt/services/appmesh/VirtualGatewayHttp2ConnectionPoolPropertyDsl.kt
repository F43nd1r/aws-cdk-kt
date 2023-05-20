@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.appmesh

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.appmesh.CfnVirtualGateway

public
    fun virtualGatewayHttp2ConnectionPoolProperty(initializer: CfnVirtualGateway.VirtualGatewayHttp2ConnectionPoolProperty.Builder.() -> Unit):
    CfnVirtualGateway.VirtualGatewayHttp2ConnectionPoolProperty =
    CfnVirtualGateway.VirtualGatewayHttp2ConnectionPoolProperty.builder().apply(initializer).build()
