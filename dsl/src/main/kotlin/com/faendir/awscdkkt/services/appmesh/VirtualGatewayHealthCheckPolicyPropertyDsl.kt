@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.appmesh

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.appmesh.CfnVirtualGateway

public
    fun virtualGatewayHealthCheckPolicyProperty(initializer: CfnVirtualGateway.VirtualGatewayHealthCheckPolicyProperty.Builder.() -> Unit):
    CfnVirtualGateway.VirtualGatewayHealthCheckPolicyProperty =
    CfnVirtualGateway.VirtualGatewayHealthCheckPolicyProperty.builder().apply(initializer).build()
