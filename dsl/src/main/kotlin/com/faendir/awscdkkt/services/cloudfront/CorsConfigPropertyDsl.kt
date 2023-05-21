package com.faendir.awscdkkt.services.cloudfront

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.cloudfront.CfnResponseHeadersPolicy

@Generated
public
    fun corsConfigProperty(initializer: CfnResponseHeadersPolicy.CorsConfigProperty.Builder.() -> Unit
    = {}): CfnResponseHeadersPolicy.CorsConfigProperty =
    CfnResponseHeadersPolicy.CorsConfigProperty.builder().apply(initializer).build()
