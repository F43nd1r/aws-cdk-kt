@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.cloudfront

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.cloudfront.CfnResponseHeadersPolicy

public
    fun corsConfigProperty(initializer: CfnResponseHeadersPolicy.CorsConfigProperty.Builder.() -> Unit):
    CfnResponseHeadersPolicy.CorsConfigProperty =
    CfnResponseHeadersPolicy.CorsConfigProperty.builder().apply(initializer).build()
