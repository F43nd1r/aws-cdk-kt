package com.faendir.awscdkkt.services.ec2

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ec2.InterfaceVpcEndpointOptions

@Generated
public fun interfaceVpcEndpointOptions(initializer: InterfaceVpcEndpointOptions.Builder.() -> Unit =
    {}): InterfaceVpcEndpointOptions =
    InterfaceVpcEndpointOptions.builder().apply(initializer).build()
