package com.faendir.awscdkkt.generated.services.appmesh

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.appmesh.CfnRoute

@Generated
public fun buildHttpRouteMatchProperty(initializer: @AwsCdkDsl
    CfnRoute.HttpRouteMatchProperty.Builder.() -> Unit): CfnRoute.HttpRouteMatchProperty =
    CfnRoute.HttpRouteMatchProperty.Builder().apply(initializer).build()
