package com.faendir.awscdkkt.services.appmesh

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.appmesh.CfnRoute

@Generated
public
    fun httpQueryParameterMatchProperty(initializer: CfnRoute.HttpQueryParameterMatchProperty.Builder.() -> Unit
    = {}): CfnRoute.HttpQueryParameterMatchProperty =
    CfnRoute.HttpQueryParameterMatchProperty.builder().apply(initializer).build()
