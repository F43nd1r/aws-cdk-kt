package com.faendir.awscdkkt.services.appmesh

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.appmesh.CfnRoute

@Generated
public fun httpPathMatchProperty(initializer: CfnRoute.HttpPathMatchProperty.Builder.() -> Unit =
    {}): CfnRoute.HttpPathMatchProperty =
    CfnRoute.HttpPathMatchProperty.builder().apply(initializer).build()
