package com.faendir.awscdkkt.services.cloudfront

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.cloudfront.CfnResponseHeadersPolicy

@Generated
public
    fun contentSecurityPolicyProperty(initializer: CfnResponseHeadersPolicy.ContentSecurityPolicyProperty.Builder.() -> Unit
    = {}): CfnResponseHeadersPolicy.ContentSecurityPolicyProperty =
    CfnResponseHeadersPolicy.ContentSecurityPolicyProperty.builder().apply(initializer).build()
