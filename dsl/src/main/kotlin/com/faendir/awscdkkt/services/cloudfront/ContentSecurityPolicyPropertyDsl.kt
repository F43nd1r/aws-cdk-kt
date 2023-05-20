@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.cloudfront

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.cloudfront.CfnResponseHeadersPolicy

public
    fun contentSecurityPolicyProperty(initializer: CfnResponseHeadersPolicy.ContentSecurityPolicyProperty.Builder.() -> Unit):
    CfnResponseHeadersPolicy.ContentSecurityPolicyProperty =
    CfnResponseHeadersPolicy.ContentSecurityPolicyProperty.builder().apply(initializer).build()
