package com.faendir.awscdkkt.services.apigateway

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.apigateway.MethodProps

@Generated
public fun methodProps(initializer: MethodProps.Builder.() -> Unit = {}): MethodProps =
    MethodProps.builder().apply(initializer).build()
