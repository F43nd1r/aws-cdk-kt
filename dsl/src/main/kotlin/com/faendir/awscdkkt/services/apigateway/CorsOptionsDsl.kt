@file:Generated(value = ["Generated 2023-05-20 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.apigateway

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.apigateway.CorsOptions

public fun corsOptions(initializer: CorsOptions.Builder.() -> Unit): CorsOptions =
    CorsOptions.builder().apply(initializer).build()
