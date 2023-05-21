package com.faendir.awscdkkt.services.ec2

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ec2.ClientVpnEndpointAttributes

@Generated
public fun clientVpnEndpointAttributes(initializer: ClientVpnEndpointAttributes.Builder.() -> Unit =
    {}): ClientVpnEndpointAttributes =
    ClientVpnEndpointAttributes.builder().apply(initializer).build()
