@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.appmesh

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.appmesh.CfnRoute

public fun httpPathMatchProperty(initializer: CfnRoute.HttpPathMatchProperty.Builder.() -> Unit):
    CfnRoute.HttpPathMatchProperty =
    CfnRoute.HttpPathMatchProperty.builder().apply(initializer).build()
