package com.faendir.awscdkkt.services.ec2

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ec2.GatewayVpcEndpointOptions

@Generated
public fun gatewayVpcEndpointOptions(initializer: GatewayVpcEndpointOptions.Builder.() -> Unit =
    {}): GatewayVpcEndpointOptions = GatewayVpcEndpointOptions.builder().apply(initializer).build()
