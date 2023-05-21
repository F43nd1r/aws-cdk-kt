package com.faendir.awscdkkt.services.apigateway

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.apigateway.CorsOptions

@Generated
public fun corsOptions(initializer: CorsOptions.Builder.() -> Unit = {}): CorsOptions =
    CorsOptions.builder().apply(initializer).build()
