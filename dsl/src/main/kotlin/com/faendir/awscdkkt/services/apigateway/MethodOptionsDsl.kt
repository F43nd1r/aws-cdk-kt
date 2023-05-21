package com.faendir.awscdkkt.services.apigateway

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.apigateway.MethodOptions

@Generated
public fun methodOptions(initializer: MethodOptions.Builder.() -> Unit = {}): MethodOptions =
    MethodOptions.builder().apply(initializer).build()
