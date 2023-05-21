package com.faendir.awscdkkt.services.ec2

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ec2.ClientVpnRouteOptions

@Generated
public fun clientVpnRouteOptions(initializer: ClientVpnRouteOptions.Builder.() -> Unit = {}):
    ClientVpnRouteOptions = ClientVpnRouteOptions.builder().apply(initializer).build()
