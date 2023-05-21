package com.faendir.awscdkkt.services.cloudfront

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.cloudfront.CfnResponseHeadersPolicy

@Generated
public
    fun referrerPolicyProperty(initializer: CfnResponseHeadersPolicy.ReferrerPolicyProperty.Builder.() -> Unit
    = {}): CfnResponseHeadersPolicy.ReferrerPolicyProperty =
    CfnResponseHeadersPolicy.ReferrerPolicyProperty.builder().apply(initializer).build()
