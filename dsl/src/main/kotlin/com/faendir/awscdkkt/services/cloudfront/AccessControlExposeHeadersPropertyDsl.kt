package com.faendir.awscdkkt.services.cloudfront

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.cloudfront.CfnResponseHeadersPolicy

@Generated
public
    fun accessControlExposeHeadersProperty(initializer: CfnResponseHeadersPolicy.AccessControlExposeHeadersProperty.Builder.() -> Unit
    = {}): CfnResponseHeadersPolicy.AccessControlExposeHeadersProperty =
    CfnResponseHeadersPolicy.AccessControlExposeHeadersProperty.builder().apply(initializer).build()
