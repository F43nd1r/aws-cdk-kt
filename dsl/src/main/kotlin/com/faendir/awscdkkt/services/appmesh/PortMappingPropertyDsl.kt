package com.faendir.awscdkkt.services.appmesh

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.appmesh.CfnVirtualRouter

@Generated
public fun portMappingProperty(initializer: CfnVirtualRouter.PortMappingProperty.Builder.() -> Unit
    = {}): CfnVirtualRouter.PortMappingProperty =
    CfnVirtualRouter.PortMappingProperty.builder().apply(initializer).build()
