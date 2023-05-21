package com.faendir.awscdkkt.services.cloudfront

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.cloudfront.CfnResponseHeadersPolicy

@Generated
public
    fun responseHeadersPolicyConfigProperty(initializer: CfnResponseHeadersPolicy.ResponseHeadersPolicyConfigProperty.Builder.() -> Unit
    = {}): CfnResponseHeadersPolicy.ResponseHeadersPolicyConfigProperty =
    CfnResponseHeadersPolicy.ResponseHeadersPolicyConfigProperty.builder().apply(initializer).build()
