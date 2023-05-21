package com.faendir.awscdkkt.services.cloudfront

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.cloudfront.CfnResponseHeadersPolicy

@Generated
public
    fun customHeaderProperty(initializer: CfnResponseHeadersPolicy.CustomHeaderProperty.Builder.() -> Unit
    = {}): CfnResponseHeadersPolicy.CustomHeaderProperty =
    CfnResponseHeadersPolicy.CustomHeaderProperty.builder().apply(initializer).build()
