package com.faendir.awscdkkt.services.ec2

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ec2.ClientVpnEndpointOptions

@Generated
public fun clientVpnEndpointOptions(initializer: ClientVpnEndpointOptions.Builder.() -> Unit = {}):
    ClientVpnEndpointOptions = ClientVpnEndpointOptions.builder().apply(initializer).build()
