package com.faendir.awscdkkt.services.appmesh

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.appmesh.CfnRoute

@Generated
public
    fun headerMatchMethodProperty(initializer: CfnRoute.HeaderMatchMethodProperty.Builder.() -> Unit
    = {}): CfnRoute.HeaderMatchMethodProperty =
    CfnRoute.HeaderMatchMethodProperty.builder().apply(initializer).build()
