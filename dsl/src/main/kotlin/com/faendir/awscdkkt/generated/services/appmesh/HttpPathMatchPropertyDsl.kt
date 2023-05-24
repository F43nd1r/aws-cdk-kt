package com.faendir.awscdkkt.generated.services.appmesh

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.appmesh.CfnRoute

@Generated
public fun buildHttpPathMatchProperty(initializer: @AwsCdkDsl
    CfnRoute.HttpPathMatchProperty.Builder.() -> Unit): CfnRoute.HttpPathMatchProperty =
    CfnRoute.HttpPathMatchProperty.Builder().apply(initializer).build()
