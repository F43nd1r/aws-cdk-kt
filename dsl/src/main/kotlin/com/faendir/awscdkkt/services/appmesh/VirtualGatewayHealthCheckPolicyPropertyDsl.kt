package com.faendir.awscdkkt.services.appmesh

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.appmesh.CfnVirtualGateway

@Generated
public
    fun virtualGatewayHealthCheckPolicyProperty(initializer: CfnVirtualGateway.VirtualGatewayHealthCheckPolicyProperty.Builder.() -> Unit
    = {}): CfnVirtualGateway.VirtualGatewayHealthCheckPolicyProperty =
    CfnVirtualGateway.VirtualGatewayHealthCheckPolicyProperty.builder().apply(initializer).build()
