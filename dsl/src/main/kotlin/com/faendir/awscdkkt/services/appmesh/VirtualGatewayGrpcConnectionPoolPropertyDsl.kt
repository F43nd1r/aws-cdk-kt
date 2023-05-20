@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.appmesh

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.appmesh.CfnVirtualGateway

public
    fun virtualGatewayGrpcConnectionPoolProperty(initializer: CfnVirtualGateway.VirtualGatewayGrpcConnectionPoolProperty.Builder.() -> Unit):
    CfnVirtualGateway.VirtualGatewayGrpcConnectionPoolProperty =
    CfnVirtualGateway.VirtualGatewayGrpcConnectionPoolProperty.builder().apply(initializer).build()
