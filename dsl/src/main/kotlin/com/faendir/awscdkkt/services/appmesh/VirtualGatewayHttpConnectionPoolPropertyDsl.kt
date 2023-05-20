@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.appmesh

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.appmesh.CfnVirtualGateway

public
    fun virtualGatewayHttpConnectionPoolProperty(initializer: CfnVirtualGateway.VirtualGatewayHttpConnectionPoolProperty.Builder.() -> Unit):
    CfnVirtualGateway.VirtualGatewayHttpConnectionPoolProperty =
    CfnVirtualGateway.VirtualGatewayHttpConnectionPoolProperty.builder().apply(initializer).build()
