package com.faendir.awscdkkt.generated.services.appmesh

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.appmesh.CfnRoute

@Generated
public fun buildHttpRouteProperty(initializer: @AwsCdkDsl
    CfnRoute.HttpRouteProperty.Builder.() -> Unit = {}): CfnRoute.HttpRouteProperty =
    CfnRoute.HttpRouteProperty.Builder().apply(initializer).build()
