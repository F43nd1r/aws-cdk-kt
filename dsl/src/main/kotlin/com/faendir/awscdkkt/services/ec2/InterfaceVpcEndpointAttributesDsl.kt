package com.faendir.awscdkkt.services.ec2

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ec2.InterfaceVpcEndpointAttributes

@Generated
public
    fun interfaceVpcEndpointAttributes(initializer: InterfaceVpcEndpointAttributes.Builder.() -> Unit
    = {}): InterfaceVpcEndpointAttributes =
    InterfaceVpcEndpointAttributes.builder().apply(initializer).build()
