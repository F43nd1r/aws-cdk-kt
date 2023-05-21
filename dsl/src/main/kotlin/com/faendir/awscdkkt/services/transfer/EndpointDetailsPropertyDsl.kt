package com.faendir.awscdkkt.services.transfer

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.transfer.CfnServer

@Generated
public fun endpointDetailsProperty(initializer: CfnServer.EndpointDetailsProperty.Builder.() -> Unit
    = {}): CfnServer.EndpointDetailsProperty =
    CfnServer.EndpointDetailsProperty.builder().apply(initializer).build()
