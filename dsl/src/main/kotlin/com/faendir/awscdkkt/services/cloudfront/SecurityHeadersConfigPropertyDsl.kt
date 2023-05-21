package com.faendir.awscdkkt.services.cloudfront

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.cloudfront.CfnResponseHeadersPolicy

@Generated
public
    fun securityHeadersConfigProperty(initializer: CfnResponseHeadersPolicy.SecurityHeadersConfigProperty.Builder.() -> Unit
    = {}): CfnResponseHeadersPolicy.SecurityHeadersConfigProperty =
    CfnResponseHeadersPolicy.SecurityHeadersConfigProperty.builder().apply(initializer).build()
